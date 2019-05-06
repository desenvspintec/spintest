/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.spin.spintest.service.v1;

import br.com.spin.spintest.base.RestQueryUtils;
import br.com.spin.spintest.base.SAbstractEntity;
import br.com.spin.spintest.base.interfaces.events.RestQueryEventBeforePostInterface;
import br.com.spin.spintest.dao.v1.QueryDAOV1;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import org.dom4j.tree.AbstractEntity;
import org.keycloak.KeycloakPrincipal;
import org.keycloak.representations.AccessToken;

/**
 *
 * @author lucas
 */
@Stateless
public class QueryServiceV1 {

    @Inject
    private QueryDAOV1 queryDAOV1;

    @Inject
    private HttpServletRequest request;

    private ObjectMapper mapper = new ObjectMapper();

    public List<Object> query(String rest, Map query) {
        return queryDAOV1.query(rest, query);
    }

    public Object save(String rest, Map body) {
        Class<?> classe = RestQueryUtils.findModelClass(rest);
        Object obj = mapper.convertValue(body, classe);
        setDefaultValues(rest, obj);
        callBeforePost(rest, obj);
        return queryDAOV1.save(rest, obj);
    }

    public Object queryById(String rest, String id) {
        return queryDAOV1.queryById(rest, id);
    }

    private void setDefaultValues(String rest, Object obj) {
        AccessToken token = ((KeycloakPrincipal) request.getUserPrincipal()).getKeycloakSecurityContext().getToken();
        SAbstractEntity entity = (SAbstractEntity) obj;
        if (entity.getId() == null) {
            entity.setCreatedAt(new Date());
            entity.setUserId(token.getId());
        }
        entity.setUpdatedAt(new Date());
        entity.setUpdatedUserId(token.getId());

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

        }
    }

}
