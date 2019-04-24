/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.lgrapp.banco.controller.v1;

import br.com.lgrapp.banco.dto.v1.PessoaJuridicaDTOV1;
import br.com.lgrapp.banco.facade.v1.custom.IPessoaJuridicaFacadeV1;
import java.util.List;
import javax.inject.Inject;
import javax.inject.Named;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author adm
 */
@Path("v1/pessoajuridica")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class PessoaJuridicaControllerV1 {

    @Inject
    @Named("PessoaJuridicaFacadeV1")
    private IPessoaJuridicaFacadeV1 pessoaJuridicaFacadeV1;
    
    @GET
    public List<PessoaJuridicaDTOV1> findAll(){
        return pessoaJuridicaFacadeV1.findAll();
    }
    
    @POST
    public void save(PessoaJuridicaDTOV1 dto){
        pessoaJuridicaFacadeV1.save(dto);
    }
    
    @DELETE
    public void delete(PessoaJuridicaDTOV1 dto){
        pessoaJuridicaFacadeV1.remove(dto);
    }
}
