/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.spin.spintest.dao.v1;

import br.com.spin.spintest.base.AbstractDAO;
import br.com.spin.spintest.model.Empresa;
import java.util.Date;
import javax.ejb.Stateless;

/**
 *
 * @author adm
 */
@Stateless
public class EmpresaDAOV1 extends AbstractDAO<Empresa> {

    public EmpresaDAOV1() {
        super(Empresa.class);
    }

    @Override
    public void save(Empresa entity) {
        entity.setUpdatedAt(new Date());
        if (entity.getId() == null) {
            entity.setCreatedAt(new Date());
        }
        super.save(entity); //To change body of generated methods, choose Tools | Templates.
    }

}
