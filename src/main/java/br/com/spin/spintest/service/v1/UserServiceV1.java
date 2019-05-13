/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.spin.spintest.service.v1;

import br.com.spin.spintest.base.auth.model.AppUser;
import br.com.spin.spintest.base.auth.model.KeycloakUser;
import br.com.spin.spintest.base.auth.service.KeycloakService;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Inject;
import org.keycloak.representations.AccessToken;
import org.keycloak.representations.idm.UserRepresentation;

/**
 *
 * @author lucas
 */
@Stateless
public class UserServiceV1 {

    @Inject
    private KeycloakService keycloakService;

    @Inject
    private PessoaFisicaServiceV1 pessoaFisicaServiceV1;

    public List<AppUser> findAll() {
        List<AppUser> ret = new ArrayList<>();
        for (KeycloakUser kuser : keycloakService.findKUsers()) {
            AppUser user = new AppUser();
            user.setId(kuser.getId());
            user.setKeycloakUser(keycloakService.findKUserById(kuser.getId()));
            user.setPessoaFisica(pessoaFisicaServiceV1.findByUserId(kuser.getId()));
            ret.add(user);
        }
        return ret;
    }

    public AppUser findById(String id) {
        AppUser user = new AppUser();
        user.setId(id);
        user.setKeycloakUser(keycloakService.findKUserById(id));
        user.setPessoaFisica(pessoaFisicaServiceV1.findByUserId(id));
        return user;
    }

    public AccessToken findAccessToken() {
        return keycloakService.findAccessToken();

    }

    public String getToken() {
        return keycloakService.getToken();
    }

    public List<UserRepresentation> findBySearch(String search) {
        return keycloakService.findBySearch(search);
    }

}
