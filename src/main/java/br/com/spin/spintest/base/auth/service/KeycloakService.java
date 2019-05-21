/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.spin.spintest.base.auth.service;

import br.com.spin.spintest.base.auth.mappers.KeycloakUserMapper;
import br.com.spin.spintest.base.auth.model.KeycloakUser;
import br.com.spin.spintest.base.restclient.ResteasyClientService;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import org.keycloak.KeycloakPrincipal;
import org.keycloak.adapters.AdapterDeploymentContext;
import org.keycloak.adapters.KeycloakDeployment;
import org.keycloak.admin.client.Keycloak;
import org.keycloak.admin.client.KeycloakBuilder;
import org.keycloak.admin.client.resource.RealmResource;
import org.keycloak.representations.AccessToken;
import org.keycloak.representations.idm.UserRepresentation;

/**
 *
 * @author lucas
 */
@Stateless
public class KeycloakService {

    @Inject
    private ResteasyClientService resteasyClientService;

    @Inject
    private HttpServletRequest request;

    @Inject
    private KeycloakUserMapper keycloakUserMapper;

    public List<UserRepresentation> findUsers() {

        return findRealmResource().users().search("");
    }

    public List<UserRepresentation> findBySearch(String search) {
        return findRealmResource().users().search(search);
    }

    public UserRepresentation findUserById(String id) {
        return findRealmResource().users().get(id).toRepresentation();
    }

    public List<KeycloakUser> findKUsers() {
        List<KeycloakUser> usersRet = new ArrayList<>();
        List<UserRepresentation> users = findUsers();
        for (UserRepresentation user : users) {
            usersRet.add(keycloakUserMapper.userRepresentationToKeycloakUser(user));
        }
        return usersRet;
    }

    public KeycloakUser findKUserById(String id) {
        return keycloakUserMapper.userRepresentationToKeycloakUser(findUserById(id));
    }

    public String getToken() {
        if (request.getUserPrincipal() != null) {
            return ((KeycloakPrincipal) request.getUserPrincipal()).getKeycloakSecurityContext().getTokenString();
        }
        return null;
    }

    public AccessToken findAccessToken() {
        if (request.getUserPrincipal() != null) {
            return ((KeycloakPrincipal) request.getUserPrincipal()).getKeycloakSecurityContext().getToken();
        }
        return null;

    }

    private RealmResource findRealmResource() {

        KeycloakDeployment deployment = findKeycloakDeployment();
        Keycloak keycloak = findKeycloakConnection(deployment);

        return keycloak.realm(deployment.getRealm());
    }

    private Keycloak findKeycloakConnection(KeycloakDeployment deployment) {

        return KeycloakBuilder.builder()
                .serverUrl(deployment.getAuthServerBaseUrl())
                .authorization(getToken())
                .realm(deployment.getRealm())
                .resteasyClient(resteasyClientService.getResteasyClient())
                .build();
    }

    private KeycloakDeployment findKeycloakDeployment() {
        AdapterDeploymentContext deploymentContext = findAdapterDeploymentContext();
        if (deploymentContext == null) {
            return null;
        }
        return deploymentContext.resolveDeployment(null);
    }

    private AdapterDeploymentContext findAdapterDeploymentContext() {
        if (request.getServletContext() == null || request.getServletContext().getAttribute(AdapterDeploymentContext.class.getName()) == null) {
            return null;
        }
        return (AdapterDeploymentContext) request.getServletContext().getAttribute(AdapterDeploymentContext.class.getName());
    }

}
