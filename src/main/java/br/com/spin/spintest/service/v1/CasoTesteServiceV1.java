/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.spin.spintest.service.v1;

import br.com.spin.spintest.base.AbstractService;
import br.com.spin.spintest.dao.v1.CasoTesteDAOV1;
import br.com.spin.spintest.model.CasoTeste;
import javax.ejb.Stateless;
import javax.inject.Inject;

/**
 *
 * @author adm
 */
@Stateless
public class CasoTesteServiceV1 extends AbstractService<CasoTeste> {

    @Inject
    private CasoTesteDAOV1 casoTesteDAOV1;

    @Override
    public CasoTesteDAOV1 getAbstractDAO() {
        return casoTesteDAOV1;
    }

}
