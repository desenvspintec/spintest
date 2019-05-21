/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.spin.spintest.events;

import br.com.spin.spintest.base.annotations.RestQueryAfterPost;
import br.com.spin.spintest.base.annotations.RestQueryBeforePost;
import br.com.spin.spintest.base.interfaces.events.RestQueryEventAfterPostInterface;
import br.com.spin.spintest.base.interfaces.events.RestQueryEventBeforePostInterface;
import br.com.spin.spintest.model.Empresa;
import br.com.spin.spintest.service.v1.EmpresaServiceV1;
import javax.inject.Inject;

/**
 *
 * @author lucas
 */
@RestQueryBeforePost(rest = "empresa")
@RestQueryAfterPost(rest = "empresa")
public class EmpresaRestQueryEvents implements RestQueryEventBeforePostInterface<Empresa>, RestQueryEventAfterPostInterface<Empresa> {

    @Inject
    private EmpresaServiceV1 empresaServiceV1;

    @Override
    public void beforePost(Empresa empresa) {
    
    }

    @Override
    public void afterPost(Empresa entity) {
     
    }

}
