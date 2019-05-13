/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.spin.spintest.base.auth.model;

import br.com.spin.spintest.model.PessoaFisica;

/**
 *
 * @author lucas
 */
public class AppUser {

    private String id;

    private PessoaFisica pessoaFisica;

    private KeycloakUser keycloakUser;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public PessoaFisica getPessoaFisica() {
        return pessoaFisica;
    }

    public void setPessoaFisica(PessoaFisica pessoaFisica) {
        this.pessoaFisica = pessoaFisica;
    }

    public KeycloakUser getKeycloakUser() {
        return keycloakUser;
    }

    public void setKeycloakUser(KeycloakUser keycloakUser) {
        this.keycloakUser = keycloakUser;
    }

}
