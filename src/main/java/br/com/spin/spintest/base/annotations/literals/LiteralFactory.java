/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.spin.spintest.base.annotations.literals;

import java.util.HashMap;

/**
 *
 * @author lucas
 */
public class LiteralFactory {

    private static final HashMap<String, RestQueryBeforePostLiteral> beforePostLiterals = new HashMap<>();

    public static RestQueryBeforePostLiteral getInstanceRestQueryBeforePostLiteral(String res) {
        if (beforePostLiterals.get(res) == null) {
            beforePostLiterals.put(res, new RestQueryBeforePostLiteral(res));
        }
        return beforePostLiterals.get(res);
    }

}
