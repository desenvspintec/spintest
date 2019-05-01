/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.spin.spintest.filters;

/**
 *
 * @author lucas
 */
@javax.ws.rs.ext.Provider
public class CORSFilter implements javax.ws.rs.container.ContainerResponseFilter {

    @Override
    public void filter(javax.ws.rs.container.ContainerRequestContext requestContext, javax.ws.rs.container.ContainerResponseContext response) {
        response.getHeaders().putSingle("Access-Control-Allow-Origin", "*");
        response.getHeaders().putSingle("Access-Control-Allow-Methods", "OPTIONS, GET, POST, PUT, DELETE");
        response.getHeaders().putSingle("Access-Control-Allow-Headers", "Content-Type");
    }
    
}
