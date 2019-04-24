/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.lgrapp.banco.controller.v1;

import br.com.lgrapp.banco.dto.v1.AgenciaDTOV1;
import br.com.lgrapp.banco.facade.v1.custom.IAgenciaFacadeV1;
import java.util.List;
import javax.inject.Inject;
import javax.inject.Named;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author adm
 */

@Path("v1/agencia")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class AgenciaControllerV1 {

    @Inject
    @Named("AgenciaFacadeV1")
    private IAgenciaFacadeV1 agenciaFacadeV1;
    
    @GET
    public List<AgenciaDTOV1> findAll(){
        return agenciaFacadeV1.findAll();
    }

}
