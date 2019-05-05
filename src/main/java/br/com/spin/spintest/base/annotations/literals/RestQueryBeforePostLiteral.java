/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.spin.spintest.base.annotations.literals;

import br.com.spin.spintest.base.annotations.RestQueryBeforePost;
import java.util.HashMap;
import javax.enterprise.util.AnnotationLiteral;

/**
 *
 * @author lucas
 */
public class RestQueryBeforePostLiteral extends AnnotationLiteral<RestQueryBeforePost> implements RestQueryBeforePost {

    public static HashMap<String, Literal> literals;

    private String rest;

    public RestQueryBeforePostLiteral(String rest) {
        this.rest = rest;
    }

    @Override
    public String rest() {
        return rest;
    }


}
