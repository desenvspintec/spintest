/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.spin.spintest.service.v1;

import br.com.spin.spintest.base.AbstractService;
import br.com.spin.spintest.dao.v1.EmpresaDAOV1;
import br.com.spin.spintest.model.Empresa;
import javax.ejb.Stateless;
import javax.inject.Inject;

/**
 *
 * @author adm
 */
@Stateless
public class EmpresaServiceV1 extends AbstractService<Empresa> {

    @Inject
    private EmpresaDAOV1 empresaDAOV1;

    @Override
    public EmpresaDAOV1 getAbstractDAO() {
        return empresaDAOV1;
    }

}
