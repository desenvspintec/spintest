/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.spin.spintest.service.v1;

import br.com.spin.spintest.base.AbstractService;
import br.com.spin.spintest.dao.v1.ProjetoTesteDAOV1;
import br.com.spin.spintest.model.ProjetoTeste;
import javax.ejb.Stateless;
import javax.inject.Inject;

/**
 *
 * @author adm
 */
@Stateless
public class ProjetoTesteServiceV1 extends AbstractService<ProjetoTeste> {

    @Inject
    private ProjetoTesteDAOV1 projetoTesteDAOV1;

    @Override
    public ProjetoTesteDAOV1 getAbstractDAO() {
        return projetoTesteDAOV1;
    }

}
