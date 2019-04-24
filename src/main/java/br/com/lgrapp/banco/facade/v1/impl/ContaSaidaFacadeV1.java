/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.lgrapp.banco.facade.v1.impl;

import br.com.lgrapp.banco.dto.v1.ContaSaidaDTOV1;
import br.com.lgrapp.banco.facade.AbstractFacade;
import br.com.lgrapp.banco.facade.v1.custom.IContaSaidaFacadeV1;
import br.com.lgrapp.banco.mappers.v1.ContaSaidaMapperV1;
import br.com.lgrapp.banco.model.Conta;
import br.com.lgrapp.banco.model.ContaSaida;
import br.com.lgrapp.banco.service.v1.custom.IContaSaidaServiceV1;
import br.com.lgrapp.banco.service.v1.custom.IContaServiceV1;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @author adm
 */
@Stateless
@Named("ContaSaidaFacadeV1")
public class ContaSaidaFacadeV1 extends AbstractFacade<ContaSaida, ContaSaidaDTOV1> implements IContaSaidaFacadeV1 {

    @Inject
    @Named("ContaSaidaServiceV1")
    private IContaSaidaServiceV1 contaSaidaServiceV1;

    @Inject
    private ContaSaidaMapperV1 contaSaidaMapperV1;
    
     @Inject
    @Named("ContaServiceV1")
    private IContaServiceV1 contaServiceV1;

    @Override
    public IContaSaidaServiceV1 getCrud() {
        return contaSaidaServiceV1;
    }

    @Override
    public ContaSaidaMapperV1 getMapper() {
        return contaSaidaMapperV1;
    }

    @Override
    public void save(ContaSaidaDTOV1 dto) {
        super.save(dto); 
        Conta conta = contaServiceV1.find(dto.getIdConta());
        conta.setVrSaldo(conta.getVrSaldo().subtract(dto.getVrOperacao()));
        contaServiceV1.save(conta);
    }
    
    

}
