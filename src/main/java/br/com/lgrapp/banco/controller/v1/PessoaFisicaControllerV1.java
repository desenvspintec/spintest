/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.lgrapp.banco.controller.v1;

import br.com.lgrapp.banco.dto.v1.PessoaFisicaDTOV1;
import br.com.lgrapp.banco.facade.v1.custom.IPessoaFisicaFacadeV1;
import br.com.lgrapp.banco.model.PessoaFisica;
import java.util.ArrayList;
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
@Path("v1/pessoafisica")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class PessoaFisicaControllerV1 {

    @Inject
    @Named("PessoaFisicaFacadeV1")
    private IPessoaFisicaFacadeV1 pessoaFisicaFacadeV1;

    @GET
    public List<PessoaFisicaDTOV1> findAll() {
        return pessoaFisicaFacadeV1.findAll();
    }

    @POST
    public void save(PessoaFisicaDTOV1 dto) {
        pessoaFisicaFacadeV1.save(dto);
    }

    @DELETE
    public void delete(PessoaFisicaDTOV1 dto) {
        pessoaFisicaFacadeV1.remove(dto);
    }

}
