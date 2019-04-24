/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.lgrapp.banco.controller.v1;

import br.com.lgrapp.banco.dto.v1.ContaDTOV1;
import br.com.lgrapp.banco.facade.v1.custom.IContaFacadeV1;
import br.com.lgrapp.banco.model.Conta;
import java.util.List;
import javax.inject.Inject;
import javax.inject.Named;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
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
@Path("v1/conta")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class ContaControllerV1 {

    @Inject
    @Named("ContaFacadeV1")
    private IContaFacadeV1 contaFacadeV1;

    @GET
    public List<ContaDTOV1> findAll() {
        return contaFacadeV1.findAll();
    }
    
    @GET
    @Path("{dsPessoa}")
    public List<ContaDTOV1> findByDsPessoa(@PathParam("dsPessoa") String dsPessoa){
        return contaFacadeV1.findByDsPessoa(dsPessoa);
    }

    @POST
    @Path("pessoafisica")
    public void createPessoaFisica(ContaDTOV1 dto) {
        contaFacadeV1.savePessoaFisica(dto);
    }

    @POST
    @Path("pessoajuridica")
    public void createPessoaJuridica(ContaDTOV1 dto) {
        contaFacadeV1.savePessoaJuridica(dto);
    }

    @DELETE
    public void inativate(Integer contaId) {
        contaFacadeV1.remove(contaId);
    }

}
