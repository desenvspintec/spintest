/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.spin.spintest.dao.v1;

import br.com.spin.spintest.base.AbstractDAO;
import br.com.spin.spintest.model.Fornecedor;
import java.util.Date;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.Query;

/**
 *
 * @author adm
 */
@Stateless
public class FornecedorDAOV1 extends AbstractDAO<Fornecedor> {

    public FornecedorDAOV1() {
        super(Fornecedor.class);
    }

    public List<Fornecedor> findByEmpresaId(Integer id) {
        Query query = getEntityManager().createQuery("select f from Fornecedor f where f.empresaId = :id");
        query.setParameter("id", id);

        return query.getResultList();
    }

    @Override
    public void save(Fornecedor entity) {
        entity.setUpdatedAt(new Date());
        if (entity.getId() == null) {
            entity.setCreatedAt(new Date());
        }
        super.save(entity); //To change body of generated methods, choose Tools | Templates.
    }

}
