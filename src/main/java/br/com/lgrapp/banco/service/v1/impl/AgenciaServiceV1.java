/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.lgrapp.banco.service.v1.impl;

import br.com.lgrapp.banco.base.crud.interfaces.ICrud;
import br.com.lgrapp.banco.dao.v1.custom.IAgenciaDAOV1;
import br.com.lgrapp.banco.model.Agencia;
import br.com.lgrapp.banco.service.AbstractService;
import br.com.lgrapp.banco.service.v1.custom.IAgenciaServiceV1;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @author adm
 */
@Stateless
@Named("AgenciaServiceV1")
public class AgenciaServiceV1 extends AbstractService<Agencia> implements IAgenciaServiceV1 {

    @Inject
    @Named("AgenciaDAOV1")
    private IAgenciaDAOV1 agenciaDAOV1;

    @Override
    public IAgenciaDAOV1 getCrud() {
        return agenciaDAOV1;
    }

}
