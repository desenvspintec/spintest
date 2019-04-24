/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.lgrapp.banco.base.exception;

import javax.ejb.ApplicationException;

/**
 *
 * @author adm
 */
@ApplicationException(rollback = true)
public class ConsistenceException extends RuntimeException {

    public ConsistenceException() {
    }

    public ConsistenceException(String message) {
        super(message);
    }

    public ConsistenceException(String message, Throwable cause) {
        super(message, cause);
    }

    public ConsistenceException(Throwable cause) {
        super(cause);
    }

    public ConsistenceException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

}
