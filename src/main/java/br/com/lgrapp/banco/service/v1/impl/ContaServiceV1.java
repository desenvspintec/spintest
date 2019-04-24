/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.lgrapp.banco.service.v1.impl;

import br.com.lgrapp.banco.dao.v1.custom.IContaDAOV1;
import br.com.lgrapp.banco.dto.v1.ContaDTOV1;
import br.com.lgrapp.banco.model.Conta;
import br.com.lgrapp.banco.service.AbstractService;
import br.com.lgrapp.banco.service.v1.custom.IContaServiceV1;
import java.util.List;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @author adm
 */
@Stateless
@Named("ContaServiceV1")
public class ContaServiceV1 extends AbstractService<Conta> implements IContaServiceV1 {

    @Inject
    @Named("ContaDAOV1")
    private IContaDAOV1 contaDAOV1;

    @Override
    public IContaDAOV1 getCrud() {
        return contaDAOV1;
    }

    @Override
    public List<Conta> findByDsPessoa(String dsPessoa) {
        return contaDAOV1.findByDsPessoa(dsPessoa);
    }

    @Override
    public Conta find(Object id) {
        return super.find(id); //To change body of generated methods, choose Tools | Templates.
    }

}
