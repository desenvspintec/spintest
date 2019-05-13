/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.spin.spintest.controller.v1;

import br.com.spin.spintest.base.auth.model.AppUser;
import br.com.spin.spintest.service.v1.UserServiceV1;
import java.util.List;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author lucas
 */
@Path("v1/user")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class UserControllerV1 {

    @Inject
    private UserServiceV1 userServiceV1;

    @GET
    public List<AppUser> findAll() {
        return userServiceV1.findAll();
    }

    @GET
    @Path("{id}")
    public AppUser findById(@PathParam("id") String id) {
        return userServiceV1.findById(id);
    }

}
