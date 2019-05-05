/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.spin.spintest.controller.v1;

import br.com.spin.spintest.model.Fornecedor;
import br.com.spin.spintest.service.v1.FornecedorServiceV1;
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
@Path("v1/fornecedor")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class FornecedorControllerV1 {

    @Inject
    private FornecedorServiceV1 fornecedorServiceV1;

    @GET
    public List<Fornecedor> findAll() {
        return fornecedorServiceV1.findAll();
    }

    @GET
    @Path("{id}")
    public Fornecedor findById(@PathParam("id") Integer id) {
        return fornecedorServiceV1.find(id);
    }

    @GET
    @Path("findbyempresa/{id}")
    public List<Fornecedor> findByEmpresaId(@PathParam("id") Integer id) {
        return fornecedorServiceV1.findByEmpresaId(id);
    }

    @POST
    public Fornecedor save(Fornecedor fornecedor) {
        fornecedorServiceV1.save(fornecedor);
        return fornecedor;
    }

}
