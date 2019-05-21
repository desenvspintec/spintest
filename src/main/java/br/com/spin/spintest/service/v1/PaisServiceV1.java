/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.spin.spintest.service.v1;

import br.com.spin.spintest.base.AbstractService;
import br.com.spin.spintest.dao.v1.PaisDAOV1;
import br.com.spin.spintest.model.Pais;
import javax.ejb.Stateless;
import javax.inject.Inject;

/**
 *
 * @author adm
 */
@Stateless
public class PaisServiceV1 extends AbstractService<Pais> {

    @Inject
    private PaisDAOV1 paisDAOV1;

    @Override
    public PaisDAOV1 getAbstractDAO() {
        return paisDAOV1;
    }

}
