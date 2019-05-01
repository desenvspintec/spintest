/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.spin.spintest.service.v1;

import br.com.spin.spintest.base.AbstractService;
import br.com.spin.spintest.dao.v1.ProdutoDAOV1;
import br.com.spin.spintest.model.Produto;
import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Inject;

/**
 *
 * @author adm
 */
@Stateless
public class ProdutoServiceV1 extends AbstractService<Produto> {

    @Inject
    private ProdutoDAOV1 produtoDAOV1;

    @Override
    public ProdutoDAOV1 getAbstractDAO() {
        return produtoDAOV1;
    }

    public List<Produto> findByIdFornecedor(Integer id) {
        return produtoDAOV1.findByIdFornecedor(id);
    }

}
