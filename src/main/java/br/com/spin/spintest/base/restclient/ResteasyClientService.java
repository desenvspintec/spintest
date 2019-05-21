/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.spin.spintest.base.restclient;

import javax.ejb.Stateless;
import org.jboss.resteasy.client.jaxrs.ResteasyClient;
import org.jboss.resteasy.client.jaxrs.ResteasyClientBuilder;

/**
 *
 * @author lucas
 */
@Stateless
public class ResteasyClientService {

    private ResteasyClient resteasyClient;

    public ResteasyClientService() {
        this.resteasyClient = new ResteasyClientBuilder().build();
    }

    public ResteasyClient getResteasyClient() {
        return resteasyClient;
    }

}
