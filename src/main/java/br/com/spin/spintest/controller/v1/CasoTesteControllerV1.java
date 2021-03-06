/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.spin.spintest.controller.v1;

import br.com.spin.spintest.model.CasoTeste;
import br.com.spin.spintest.service.v1.CasoTesteServiceV1;
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
 * @author adm
 */
@Path("v1/casoteste")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class CasoTesteControllerV1 {

    @Inject
    private CasoTesteServiceV1 casoTesteServiceV1;

    @GET
    public List<CasoTeste> findAll() {
        return casoTesteServiceV1.findAll();
    }

    @GET
    @Path("{id}")
    public CasoTeste findById(@PathParam("id") Integer id) {
        return casoTesteServiceV1.find(id);
    }

}
