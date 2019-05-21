/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.spin.spintest.service.v1;

import br.com.spin.spintest.base.AbstractService;
import br.com.spin.spintest.dao.v1.PlanoTesteDAOV1;
import javax.ejb.Stateless;
import br.com.spin.spintest.model.PlanoTeste;
import javax.inject.Inject;

/**
 *
 * @author adm
 */
@Stateless
public class PlanoTesteServiceV1 extends AbstractService<PlanoTeste> {

    @Inject
    private PlanoTesteDAOV1 planoTesteDAOV1;

    @Override
    public PlanoTesteDAOV1 getAbstractDAO() {
        return planoTesteDAOV1;
    }

}
