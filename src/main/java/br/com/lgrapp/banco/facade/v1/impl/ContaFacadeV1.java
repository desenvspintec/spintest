/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.lgrapp.banco.facade.v1.impl;

import br.com.lgrapp.banco.dto.v1.ContaDTOV1;
import br.com.lgrapp.banco.enuns.TipoPessoaEnum;
import br.com.lgrapp.banco.facade.AbstractFacade;
import br.com.lgrapp.banco.facade.v1.custom.IContaFacadeV1;
import br.com.lgrapp.banco.mappers.v1.ContaMapperV1;
import br.com.lgrapp.banco.model.Conta;
import br.com.lgrapp.banco.service.v1.custom.IContaServiceV1;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @author adm
 */
@Stateless
@Named("ContaFacadeV1")
public class ContaFacadeV1 extends AbstractFacade<Conta, ContaDTOV1> implements IContaFacadeV1 {

    @Inject
    @Named("ContaServiceV1")
    private IContaServiceV1 contaServiceV1;

    @Inject
    private ContaMapperV1 contaMapperV1;

    @Override
    public IContaServiceV1 getCrud() {
        return contaServiceV1;
    }

    @Override
    public ContaMapperV1 getMapper() {
        return contaMapperV1;
    }

    @Override
    public void remove(Object id) {
        Conta conta = contaServiceV1.find(id);
        conta.setDtFechamento(new Date());
        contaServiceV1.save(conta);
    }

    @Override
    public void savePessoaFisica(ContaDTOV1 dto) {
        dto.setTipoPessoa(TipoPessoaEnum.PESSOA_FISICA);
        super.save(dto);
    }

    @Override
    public void savePessoaJuridica(ContaDTOV1 dto) {
        dto.setTipoPessoa(TipoPessoaEnum.PESSOA_JURIDICA);
        super.save(dto);
    }

    @Override
    public List<ContaDTOV1> findByDsPessoa(String dsPessoa) {
        List<Conta> contas = contaServiceV1.findByDsPessoa(dsPessoa);
        List<ContaDTOV1> dtoList = new ArrayList<>();
        for (Conta conta : contas) {
            dtoList.add(getMapper().convertToDto(conta));
        }
        return dtoList;
    }

}
