/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.spin.spintest.service.v1;

import br.com.spin.spintest.base.AbstractService;
import br.com.spin.spintest.dao.v1.FuncionalidadeDAOV1;
import br.com.spin.spintest.model.Funcionalidade;
import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Inject;

/**
 *
 * @author adm
 */
@Stateless
public class FuncionalidadeServiceV1 extends AbstractService<Funcionalidade> {

    @Inject
    private FuncionalidadeDAOV1 funcionalidadeDAOV1;

    @Override
    public FuncionalidadeDAOV1 getAbstractDAO() {
        return funcionalidadeDAOV1;
    }

    public List<Funcionalidade> findByProdutoId(Integer id) {
        return funcionalidadeDAOV1.findByProdutoId(id);
    }

}
