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
public class RestQueryException extends RuntimeException {

    public RestQueryException() {
    }

    public RestQueryException(String string) {
        super(string);
    }

    public RestQueryException(String string, Throwable thrwbl) {
        super(string, thrwbl);
    }

    public RestQueryException(Throwable thrwbl) {
        super(thrwbl);
    }

    public RestQueryException(String string, Throwable thrwbl, boolean bln, boolean bln1) {
        super(string, thrwbl, bln, bln1);
    }

}
