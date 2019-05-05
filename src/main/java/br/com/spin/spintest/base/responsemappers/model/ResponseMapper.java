/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.spin.spintest.base.responsemappers.model;

/**
 *
 * @author lucas
 */
public class ResponseMapper {

    private String message;

    public ResponseMapper(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

}
