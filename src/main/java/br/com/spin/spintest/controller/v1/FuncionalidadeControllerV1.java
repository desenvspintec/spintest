/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.spin.spintest.controller.v1;

import br.com.spin.spintest.base.AbstractDAO;
import br.com.spin.spintest.model.Funcionalidade;
import br.com.spin.spintest.service.v1.FuncionalidadeServiceV1;
import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author adm
 */

@Path("v1/funcionalidade")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class FuncionalidadeControllerV1 {
    
    @Inject
    private FuncionalidadeServiceV1 funcionalidadeServiceV1;
    
    @GET
    @Path("findbyproduto/{id}")
    public List<Funcionalidade> findByProdutoId(@PathParam("id") Integer id){
        return funcionalidadeServiceV1.findByProdutoId(id);
    }

}
