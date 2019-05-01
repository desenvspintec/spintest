/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.spin.spintest.service.v1;

import br.com.spin.spintest.base.AbstractService;
import br.com.spin.spintest.dao.v1.PessoaFisicaDAOV1;
import br.com.spin.spintest.model.PessoaFisica;
import javax.ejb.Stateless;
import javax.inject.Inject;

/**
 *
 * @author adm
 */
@Stateless
public class PessoaFisicaServiceV1 extends AbstractService<PessoaFisica> {

    @Inject
    private PessoaFisicaDAOV1 pessoaFisicaDAOV1;

    @Override
    public PessoaFisicaDAOV1 getAbstractDAO() {
        return pessoaFisicaDAOV1;
    }

}
