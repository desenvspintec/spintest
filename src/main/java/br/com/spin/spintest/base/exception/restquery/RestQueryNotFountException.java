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
public class RestQueryNotFountException extends RestQueryException {

    public RestQueryNotFountException(String string) {
        super("A entidade do rest " + string + " não foi encontrada!");
    }

}
