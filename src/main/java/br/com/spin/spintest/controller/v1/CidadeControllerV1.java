/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.spin.spintest.controller.v1;

import br.com.spin.spintest.model.Cidade;
import br.com.spin.spintest.service.v1.CidadeServiceV1;
import java.util.List;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author adm
 */
@Path("v1/cidade")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class CidadeControllerV1 {

    @Inject
    private CidadeServiceV1 cidadeServiceV1;

    @GET
    public List<Cidade> findAll() {
        return cidadeServiceV1.findAll();
    }

    @GET
    @Path("{id}")
    public Cidade findById(@PathParam("id") Integer id) {
        return cidadeServiceV1.find(id);
    }

    @POST
    public Cidade save(Cidade cidade) {
        cidadeServiceV1.save(cidade);
        return cidade;
    }
}
