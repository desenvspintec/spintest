/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.lgrapp.banco.facade.v1.impl;

import br.com.lgrapp.banco.dto.v1.AgenciaDTOV1;
import br.com.lgrapp.banco.facade.AbstractFacade;
import br.com.lgrapp.banco.facade.v1.custom.IAgenciaFacadeV1;
import br.com.lgrapp.banco.mappers.v1.AgenciaMapperV1;
import br.com.lgrapp.banco.model.Agencia;
import br.com.lgrapp.banco.service.v1.custom.IAgenciaServiceV1;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @author adm
 */
@Stateless
@Named("AgenciaFacadeV1")
public class AgenciaFacadeV1 extends AbstractFacade<Agencia, AgenciaDTOV1> implements IAgenciaFacadeV1 {

    @Inject
    @Named("AgenciaServiceV1")
    private IAgenciaServiceV1 agenciaServiceV1;

    @Inject
    private AgenciaMapperV1 agenciaMapperV1;

    @Override
    public IAgenciaServiceV1 getCrud() {
        return agenciaServiceV1;
    }

    @Override
    public AgenciaMapperV1 getMapper() {
        return agenciaMapperV1;
    }

}
