/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.spin.spintest.service.v1;

import br.com.spin.spintest.base.AbstractService;
import br.com.spin.spintest.dao.v1.CidadeDAOV1;
import br.com.spin.spintest.model.Cidade;
import javax.ejb.Stateless;
import javax.inject.Inject;

/**
 *
 * @author adm
 */
@Stateless
public class CidadeServiceV1 extends AbstractService<Cidade> {

    @Inject
    private CidadeDAOV1 cidadeDAOV1;

    @Override
    public CidadeDAOV1 getAbstractDAO() {
        return cidadeDAOV1;
    }

}
