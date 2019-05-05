/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.spin.spintest.service.v1;

import br.com.spin.spintest.base.RestQueryUtils;
import br.com.spin.spintest.base.annotations.RestQueryBeforePost;
import br.com.spin.spintest.base.annotations.literals.LiteralFactory;
import br.com.spin.spintest.base.interfaces.events.RestQueryEventBeforePostInterface;
import br.com.spin.spintest.dao.v1.QueryDAOV1;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.Stateless;
import javax.ejb.embeddable.EJBContainer;
import javax.enterprise.inject.spi.CDI;
import javax.inject.Inject;
import javax.naming.InitialContext;
import javax.naming.NamingException;

/**
 *
 * @author lucas
 */
@Stateless
public class QueryServiceV1 {

    @Inject
    private QueryDAOV1 queryDAOV1;
    private ObjectMapper mapper = new ObjectMapper();

    public List<Object> query(String rest, Map query) {
        return queryDAOV1.query(rest, query);
    }

    public Object save(String rest, Map body) {
        Class<?> classe = RestQueryUtils.findModelClass(rest);
        Object obj = mapper.convertValue(body, classe);
        callBeforePost(rest, obj);
        return queryDAOV1.save(rest, obj);
    }

    public Object queryById(String rest, String id) {
        return queryDAOV1.queryById(rest, id);
    }

    private void callBeforePost(String rest, Object obj) {

        Class<?> classe = RestQueryUtils.findBeforePostClass(rest);
        if (classe != null) {

            try {
                Object rqvbfObject = rqvbfObject = classe.newInstance();
                RestQueryUtils.setInjections(rqvbfObject);
                if (rqvbfObject != null) {
                    ((RestQueryEventBeforePostInterface) rqvbfObject).beforePost(obj);
                }
            } catch (InstantiationException ex) {
                Logger.getLogger(QueryServiceV1.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IllegalAccessException ex) {
                Logger.getLogger(QueryServiceV1.class.getName()).log(Level.SEVERE, null, ex);
            }
            //  Object rqvbfObject = CDI.current().select(RestQueryBeforePost.class, LiteralFactory.getInstanceRestQueryBeforePostLiteral(rest)).get();

            //  RestQueryUtils.setInjections(rqvbfObject);
            //   ((RestQueryEventBeforePostInterface) rqvbfObject).beforePost(obj);
        }

    }

}
