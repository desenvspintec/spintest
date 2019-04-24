/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.lgrapp.banco.facade.v1.impl;


import br.com.lgrapp.banco.dto.v1.ContaEntradaDTOV1;
import br.com.lgrapp.banco.facade.AbstractFacade;
import br.com.lgrapp.banco.facade.v1.custom.IContaEntradaFacadeV1;
import br.com.lgrapp.banco.mappers.v1.ContaEntradaMapperV1;
import br.com.lgrapp.banco.model.Conta;
import br.com.lgrapp.banco.model.ContaEntrada;
import br.com.lgrapp.banco.service.v1.custom.IContaEntradaServiceV1;
import br.com.lgrapp.banco.service.v1.custom.IContaServiceV1;
import br.com.lgrapp.banco.service.v1.impl.ContaServiceV1;
import java.math.BigDecimal;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @author adm
 */
@Stateless
@Named("ContaEntradaFacadeV1")
public class ContaEntradaFacadeV1 extends AbstractFacade<ContaEntrada, ContaEntradaDTOV1> implements IContaEntradaFacadeV1 {

    @Inject
    @Named("ContaEntradaServiceV1")
    private IContaEntradaServiceV1 contaEntradaServiceV1;

    @Inject
    @Named("ContaServiceV1")
    private IContaServiceV1 contaServiceV1;
    
    @Inject
    private ContaEntradaMapperV1 contaEntradaMapperV1;
    
    
    @Override
    public IContaEntradaServiceV1 getCrud() {
        return contaEntradaServiceV1;
    }

    @Override
    public ContaEntradaMapperV1 getMapper() {
        return contaEntradaMapperV1;
    }

    @Override
    public void save(ContaEntradaDTOV1 dto) {
        super.save(dto);
        Conta conta = contaServiceV1.find(dto.getIdConta());
        conta.setVrSaldo(conta.getVrSaldo().add(dto.getVrOperacao()));
        contaServiceV1.save(conta);
        
    }
    
    

}
