/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.spin.spintest.service.v1;

import br.com.spin.spintest.base.AbstractService;
import br.com.spin.spintest.dao.v1.CentralCompanyDAOV1;
import br.com.spin.spintest.model.CentralCompany;
import javax.ejb.Stateless;
import javax.inject.Inject;

/**
 *
 * @author adm
 */
@Stateless
public class CentralCompanyServiceV1 extends AbstractService<CentralCompany> {

    @Inject
    private CentralCompanyDAOV1 centralCompanyDAOV1;

    @Override
    public CentralCompanyDAOV1 getAbstractDAO() {
        return centralCompanyDAOV1;
    }

}
