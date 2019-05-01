/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.spin.spintest.controller.v1;

import br.com.spin.spintest.model.Produto;
import br.com.spin.spintest.service.v1.ProdutoServiceV1;
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
@Path("v1/produto")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class ProdutoControllerV1 {

    @Inject
    private ProdutoServiceV1 produtoServiceV1;
    
    @GET
    @Path("findbyfornecedor/{id}")
    public List<Produto> findByIdFornecedor(@PathParam("id") Integer id){
        return produtoServiceV1.findByIdFornecedor(id);
    }

}
