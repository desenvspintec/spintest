/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.lgrapp.banco.facade.v1.impl;

import br.com.lgrapp.banco.dto.v1.PessoaFisicaDTOV1;
import br.com.lgrapp.banco.facade.AbstractFacade;
import br.com.lgrapp.banco.facade.v1.custom.IPessoaFisicaFacadeV1;
import br.com.lgrapp.banco.mappers.v1.PessoaFisicaMapperV1;
import br.com.lgrapp.banco.model.PessoaFisica;
import br.com.lgrapp.banco.service.v1.custom.IPessoaFisicaServiceV1;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @author adm
 */
@Stateless
@Named("PessoaFisicaFacadeV1")
public class PessoaFisicaFacadeV1 extends AbstractFacade<PessoaFisica, PessoaFisicaDTOV1> implements IPessoaFisicaFacadeV1{

    @Inject
    @Named("PessoaFisicaServiceV1")
    private IPessoaFisicaServiceV1 pessoaFisicaServiceV1;

    @Inject
    private PessoaFisicaMapperV1 pessoaFisicaMapperV1;

    @Override
    public IPessoaFisicaServiceV1 getCrud() {
        return pessoaFisicaServiceV1;
    }

    @Override
    public PessoaFisicaMapperV1 getMapper() {
        return pessoaFisicaMapperV1;
    }

}
