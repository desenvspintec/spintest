/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.lgrapp.banco.facade.v1.impl;

import br.com.lgrapp.banco.dto.v1.PessoaJuridicaDTOV1;
import br.com.lgrapp.banco.facade.AbstractFacade;
import br.com.lgrapp.banco.facade.v1.custom.IPessoaJuridicaFacadeV1;
import br.com.lgrapp.banco.mappers.v1.PessoaJuridicaMapperV1;
import br.com.lgrapp.banco.model.PessoaJuridica;
import br.com.lgrapp.banco.service.v1.custom.IPessoaJuridicaServiceV1;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @author adm
 */
@Stateless
@Named("PessoaJuridicaFacadeV1")
public class PessoaJuridicaFacadeV1 extends AbstractFacade<PessoaJuridica, PessoaJuridicaDTOV1> implements IPessoaJuridicaFacadeV1{

    @Inject
    @Named("PessoaJuridicaServiceV1")
    private IPessoaJuridicaServiceV1 pessoaJuridicaServiceV1;

    @Inject
    private PessoaJuridicaMapperV1 pessoaJuridicaMapperV1;

    @Override
    public IPessoaJuridicaServiceV1 getCrud() {
        return pessoaJuridicaServiceV1;
    }

    @Override
    public PessoaJuridicaMapperV1 getMapper() {
        return pessoaJuridicaMapperV1;
    }

}
