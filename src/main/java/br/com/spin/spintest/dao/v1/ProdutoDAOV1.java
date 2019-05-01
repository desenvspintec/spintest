/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.spin.spintest.dao.v1;

import br.com.spin.spintest.base.AbstractDAO;
import br.com.spin.spintest.model.Produto;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.Query;

/**
 *
 * @author adm
 */
@Stateless
public class ProdutoDAOV1 extends AbstractDAO<Produto> {

    public ProdutoDAOV1() {
        super(Produto.class);
    }

    public List<Produto> findByIdFornecedor(Integer id) {
        Query query = getEntityManager().createQuery("select p from Produto p where p.fornecedorId = :id ");
        query.setParameter("id", id);
        return query.getResultList();
    }

}
