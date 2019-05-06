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
import br.com.spin.spintest.model.Pais;

/**
 *
 * @author lucas
 */
@RestQueryBeforePost(rest = "pais")
@RestQueryAfterPost(rest = "pais")
public class PaisRestQueryEvents implements RestQueryEventBeforePostInterface<Pais>, RestQueryEventAfterPostInterface<Pais> {

    @Override
    public void beforePost(Pais entity) {

    }

    @Override
    public void afterPost(Pais entity) {

    }

}
