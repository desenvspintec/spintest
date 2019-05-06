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
import br.com.spin.spintest.model.SuiteTeste;

/**
 *
 * @author lucas
 */
@RestQueryBeforePost(rest = "suiteteste")
@RestQueryAfterPost(rest = "suiteteste")
public class SuiteTesteRestQueryEvents implements RestQueryEventBeforePostInterface<SuiteTeste>, RestQueryEventAfterPostInterface<SuiteTeste> {

    @Override
    public void beforePost(SuiteTeste entity) {
       
    }

    @Override
    public void afterPost(SuiteTeste entity) {
      
    }

}
