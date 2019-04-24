/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.lgrapp.banco.service.v1.impl;

import br.com.lgrapp.banco.model.ContaEntrada;
import br.com.lgrapp.banco.service.AbstractService;
import br.com.lgrapp.banco.service.v1.custom.IContaEntradaServiceV1;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.inject.Named;
import br.com.lgrapp.banco.dao.v1.custom.IContaEntradaDAOV1;

/**
 *
 * @author adm
 */
@Stateless
@Named("ContaEntradaServiceV1")
public class ContaEntradaServiceV1 extends AbstractService<ContaEntrada> implements IContaEntradaServiceV1 {

    @Inject
    @Named("ContaEntradaDAOV1")
    private IContaEntradaDAOV1 contaEntradaDAOV1;

    public IContaEntradaDAOV1 getCrud() {
        return contaEntradaDAOV1;
    }

}
