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
public class RestQueryNoSuchMethodException extends RestQueryException {

    public RestQueryNoSuchMethodException() {
    }

    public RestQueryNoSuchMethodException(String string) {
        super(string);
    }

    public RestQueryNoSuchMethodException(String string, Throwable thrwbl) {
        super(string, thrwbl);
    }

    public RestQueryNoSuchMethodException(Throwable thrwbl) {
        super(thrwbl);
    }

    public RestQueryNoSuchMethodException(String string, Throwable thrwbl, boolean bln, boolean bln1) {
        super(string, thrwbl, bln, bln1);
    }

}
