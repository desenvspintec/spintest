/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.spin.spintest.base.exception.restquery;

/**
 *
 * @author lucas
 */
public class RestQueryBeforPostNotImplemented extends RuntimeException {

    public RestQueryBeforPostNotImplemented() {
    }

    public RestQueryBeforPostNotImplemented(String string) {
        super("Não foi implementado a interface RestQueryEventBeforePostInterface para o model" + string);
    }

}
