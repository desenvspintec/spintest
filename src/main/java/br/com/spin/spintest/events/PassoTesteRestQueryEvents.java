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
import br.com.spin.spintest.model.PassoTeste;

/**
 *
 * @author lucas
 */
@RestQueryBeforePost(rest = "passoteste")
@RestQueryAfterPost(rest = "passoteste")
public class PassoTesteRestQueryEvents implements RestQueryEventBeforePostInterface<PassoTeste>, RestQueryEventAfterPostInterface<PassoTeste> {

    @Override
    public void beforePost(PassoTeste entity) {

    }

    @Override
    public void afterPost(PassoTeste entity) {

    }

}
