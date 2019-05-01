/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.spin.spintest.controller.v1;

import br.com.spin.spintest.model.BaselinePlanejado;
import br.com.spin.spintest.service.v1.BaselinePlanejadoServiceV1;
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
@Path("v1/baselineplanejado")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class BaselinePlanejadoControllerV1 {

    @Inject
    private BaselinePlanejadoServiceV1 baselinePlanejadoServiceV1;

    @GET
    public List<BaselinePlanejado> findAll() {
        return baselinePlanejadoServiceV1.findAll();
    }

    @GET
    @Path("{id}")
    public BaselinePlanejado findById(@PathParam("id") Integer id) {
        return baselinePlanejadoServiceV1.find(id);
    }

    @POST
    public BaselinePlanejado save(BaselinePlanejado baselinePlanejado) {
        baselinePlanejadoServiceV1.save(baselinePlanejado);
        return baselinePlanejado;
    }

}
