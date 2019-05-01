/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.spin.spintest.service.v1;

import br.com.spin.spintest.base.AbstractService;
import br.com.spin.spintest.dao.v1.BaselinePlanejadoDAOV1;
import br.com.spin.spintest.model.BaselinePlanejado;
import javax.ejb.Stateless;
import javax.inject.Inject;

/**
 *
 * @author adm
 */
@Stateless
public class BaselinePlanejadoServiceV1 extends AbstractService<BaselinePlanejado> {

    @Inject
    private BaselinePlanejadoDAOV1 baselinePlanejadoDAOV1;

    @Override
    public BaselinePlanejadoDAOV1 getAbstractDAO() {
        return baselinePlanejadoDAOV1;
    }

}
