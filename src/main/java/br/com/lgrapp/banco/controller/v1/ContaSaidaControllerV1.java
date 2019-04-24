/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.lgrapp.banco.controller.v1;

import br.com.lgrapp.banco.dto.v1.ContaSaidaDTOV1;
import br.com.lgrapp.banco.facade.v1.custom.IContaSaidaFacadeV1;
import java.util.List;
import javax.inject.Inject;
import javax.inject.Named;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author adm
 */
@Path("v1/contasaida")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class ContaSaidaControllerV1 {

    @Inject
    @Named("ContaSaidaFacadeV1")
    private IContaSaidaFacadeV1 contaSaidaFacadeV1;

    @GET
    public List<ContaSaidaDTOV1> findAll() {
        return contaSaidaFacadeV1.findAll();
    }
    
    @POST
    public void save(ContaSaidaDTOV1 dto){
        contaSaidaFacadeV1.save(dto);
    }

}
