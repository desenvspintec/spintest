/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.spin.spintest.service.v1;

import br.com.spin.spintest.base.AbstractService;
import br.com.spin.spintest.dao.v1.FornecedorDAOV1;
import br.com.spin.spintest.model.Fornecedor;
import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Inject;

/**
 *
 * @author adm
 */
@Stateless
public class FornecedorServiceV1 extends AbstractService<Fornecedor> {

    @Inject
    private FornecedorDAOV1 fornecedorDAOV1;

    @Override
    public FornecedorDAOV1 getAbstractDAO() {
        return fornecedorDAOV1;
    }

    public List<Fornecedor> findByEmpresaId(Integer id) {
        return fornecedorDAOV1.findByEmpresaId(id);
    }

}
