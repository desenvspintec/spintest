/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.spin.spintest.dao.v1;

import br.com.spin.spintest.base.AbstractDAO;
import br.com.spin.spintest.model.Funcionalidade;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.Query;

/**
 *
 * @author adm
 */
@Stateless
public class FuncionalidadeDAOV1 extends AbstractDAO<Funcionalidade> {

    public FuncionalidadeDAOV1() {
        super(Funcionalidade.class);
    }

    public List<Funcionalidade> findByProdutoId(Integer id) {
        Query query = getEntityManager().createQuery("select f from Funcionalidade f where f.produtoId = :id");
        query.setParameter("id", id);
        return query.getResultList();
    }

}
