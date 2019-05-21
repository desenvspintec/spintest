/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.spin.spintest.service.v1;

import br.com.spin.spintest.base.AbstractService;
import br.com.spin.spintest.dao.v1.SuiteTesteDAOV1;
import br.com.spin.spintest.model.SuiteTeste;
import javax.ejb.Stateless;
import javax.inject.Inject;

/**
 *
 * @author adm
 */
@Stateless
public class SuiteTesteServiceV1 extends AbstractService<SuiteTeste> {

    @Inject
    private SuiteTesteDAOV1 suiteTesteDAOV1;

    @Override
    public SuiteTesteDAOV1 getAbstractDAO() {
        return suiteTesteDAOV1;
    }

}
