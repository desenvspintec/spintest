/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.spin.spintest.base.auth.mappers;

import br.com.spin.spintest.base.auth.model.KeycloakUser;
import java.util.Date;
import javax.ejb.Stateless;
import org.keycloak.representations.idm.UserRepresentation;

/**
 *
 * @author lucas
 */
@Stateless
public class KeycloakUserMapper {

    public KeycloakUser userRepresentationToKeycloakUser(UserRepresentation rep) {
        KeycloakUser user = new KeycloakUser();
        user.setCreatedTimestamp(new Date(rep.getCreatedTimestamp()));
        user.setFirstName(rep.getFirstName());
        user.setId(rep.getId());
        user.setLastName(rep.getLastName());
        user.setUsername(rep.getUsername());
        user.setEmail(rep.getEmail());
        return user;
    }
}
