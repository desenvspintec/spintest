/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.spin.spintest.controller.v1;

import br.com.spin.spintest.model.Empresa;
import br.com.spin.spintest.service.v1.EmpresaServiceV1;
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
@Path("v1/empresa")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class EmpresaControllerV1 {

    @Inject
    private EmpresaServiceV1 empresaServiceV1;

    @GET
    public List<Empresa> findAll() {
        return empresaServiceV1.findAll();
    }

    @GET
    @Path("{id}")
    public Empresa findById(@PathParam("id") Integer id) {
        return empresaServiceV1.find(id);
    }

    @POST
    public Empresa save(Empresa empresa) {
        empresaServiceV1.save(empresa);
        return empresa;
    }

}
