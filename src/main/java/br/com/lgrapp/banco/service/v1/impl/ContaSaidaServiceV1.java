/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.lgrapp.banco.service.v1.impl;


import br.com.lgrapp.banco.dao.v1.custom.IContaSaidaDAOV1;
import br.com.lgrapp.banco.model.ContaSaida;
import br.com.lgrapp.banco.service.AbstractService;
import br.com.lgrapp.banco.service.v1.custom.IContaSaidaServiceV1;
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
@Named("ContaSaidaServiceV1")
public class ContaSaidaServiceV1 extends AbstractService<ContaSaida> implements IContaSaidaServiceV1 {

    @Inject
    @Named("ContaSaidaDAOV1")
    private IContaSaidaDAOV1 contaSaidaDAOV1;

    @Override
    public IContaSaidaDAOV1 getCrud() {
        return contaSaidaDAOV1;
    }

}
