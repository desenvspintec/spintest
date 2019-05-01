/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.spin.spintest.service.v1;

import br.com.spin.spintest.base.AbstractService;
import br.com.spin.spintest.dao.v1.EstadoDAOV1;
import br.com.spin.spintest.model.Estado;
import javax.ejb.Stateless;
import javax.inject.Inject;

/**
 *
 * @author adm
 */
@Stateless
public class EstadoServiceV1 extends AbstractService<Estado> {

    @Inject
    private EstadoDAOV1 estadoDAOV1;

    @Override
    public EstadoDAOV1 getAbstractDAO() {
        return estadoDAOV1;
    }

}
