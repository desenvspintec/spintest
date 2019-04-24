/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.lgrapp.banco.service.v1.impl;

import br.com.lgrapp.banco.base.crud.interfaces.ICrud;
import br.com.lgrapp.banco.dao.v1.custom.IPessoaFisicaDAOV1;
import br.com.lgrapp.banco.model.PessoaFisica;
import br.com.lgrapp.banco.service.AbstractService;
import br.com.lgrapp.banco.service.v1.custom.IPessoaFisicaServiceV1;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @author adm
 */
@Stateless
@Named("PessoaFisicaServiceV1")
public class PessoaFisicaServiceV1 extends AbstractService<PessoaFisica> implements IPessoaFisicaServiceV1 {

    @Inject
    @Named("PessoaFisicaDAOV1")
    private IPessoaFisicaDAOV1 pessoaFisicaDAOV1;

    @Override
    public IPessoaFisicaDAOV1 getCrud() {
        return pessoaFisicaDAOV1;
    }
    
    
}
