/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.spin.spintest.dao.v1;

import br.com.spin.spintest.base.RestQueryUtils;
import br.com.spin.spintest.base.annotations.RestQuery;
import br.com.spin.spintest.base.exception.restquery.RestQueryDateParseException;
import br.com.spin.spintest.base.exception.restquery.RestQueryNotFountException;
import br.com.spin.spintest.base.SAbstractEntity;
import br.com.spin.spintest.base.exception.restquery.RestQueryNoSuchMethodException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.AbstractQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.reflections.Reflections;

/**
 *
 * @author lucas
 */
@Stateless
public class QueryDAOV1 {

    @PersistenceContext
    private EntityManager entityManager;
 
    private static final SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    public List<Object> query(String rest, Map<String, String> query) {

        Class<?> classe = RestQueryUtils.findModelClass(rest);

        CriteriaBuilder cb = entityManager.getCriteriaBuilder();

        AbstractQuery cq = cb.createQuery(classe);

        Root root = cq.from(classe);
        if (query != null) {
            for (String attribute : query.keySet()) {
                cq.where(cb.equal(root.get(attribute), findObjectQueryValue(classe, query, attribute)));
            }

        }
        CriteriaQuery select = ((CriteriaQuery) cq).select(root);
        TypedQuery tq = entityManager.createQuery(select);

        return tq.getResultList();

    }

    public Object save(String rest, Object body) {
        
       
        save(body);
        return body;
    }

    public Object queryById(String rest, String id) {
        if (id == null) {
            return null;
        }
        Class<?> classe = RestQueryUtils.findModelClass(rest);
        Method method;
        try {
            method = classe.getDeclaredMethod("getId");
            Class<?> methodReturnType = method.getReturnType();
            return entityManager.find(classe, findObjectValueId(methodReturnType, id));
        } catch (NoSuchMethodException ex) {
            throw new RestQueryNoSuchMethodException(ex.getMessage(), ex);
        } catch (SecurityException ex) {
            throw new RestQueryNoSuchMethodException(ex.getMessage(), ex);
        }

    }

    private Object findObjectQueryValue(Class<?> classe, Map query, String attribute) {
        Object value = null;
        for (Field field : classe.getDeclaredFields()) {
            if (field.getName().equalsIgnoreCase(attribute)) {
                String strValue = null;
                if (query.get(attribute) != null && !query.get(attribute).toString().equalsIgnoreCase("")) {
                    if (query.get(attribute) instanceof List) {
                        strValue = ((List<String>) query.get(attribute)).get(0);
                    } else {
                        strValue = query.get(attribute).toString();
                    }
                } else {
                    return null;
                }

                Class<?> attributeType = field.getType();
                value = findObjectValue(attributeType, strValue);
            }
        }
        return value;
    }

    private Object findObjectValueId(Class<?> classe, String id) {
        return findObjectValue(classe, id);
    }

    private Object findObjectValue(Class<?> attributeType, String strValue) {
        Object value = null;
        if (String.class.equals(attributeType)) {
            value = strValue;
        } else if (Integer.class.equals(attributeType)) {
            value = Integer.valueOf(strValue);
        } else if (Long.class.equals(attributeType)) {
            value = Long.valueOf(strValue);
        } else if (Double.class.equals(attributeType)) {
            value = Double.valueOf(strValue);
        } else if (Float.class.equals(attributeType)) {
            value = Float.valueOf(strValue);
        } else if (Character.class.equals(attributeType)) {
            value = strValue;
        } else if (Boolean.class.equals(attributeType)) {
            value = Boolean.valueOf(strValue);
        } else if (Date.class.equals(attributeType)) {

            try {
                if (strValue.length() == 10) {
                    strValue += "T:00:00:00";
                }
                value = sdf.parse(strValue);
            } catch (ParseException ex) {
                throw new RestQueryDateParseException(ex.getMessage(), ex);
            }
        }
        return value;
    }

  

    private void insert(Object entity) {
        entityManager.persist(entity);
        entityManager.flush();
    }

    private void update(Object entity) {
        entityManager.merge(entity);
        entityManager.flush();
    }

    private void save(Object entity) {
        if (((SAbstractEntity) entity).getId() == null) {
            insert(entity);
        } else {
            update(entity);
        }
    }
}
