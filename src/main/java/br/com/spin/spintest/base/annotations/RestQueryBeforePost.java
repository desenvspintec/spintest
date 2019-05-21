/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.spin.spintest.base.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.HashMap;
import javax.enterprise.util.AnnotationLiteral;
import javax.inject.Qualifier;

/**
 *
 * @author lucas
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Qualifier
public @interface RestQueryBeforePost {

    String rest();

    class Literal extends AnnotationLiteral<RestQueryBeforePost> implements RestQueryBeforePost {

        public static HashMap<String, Literal> literals;

        private final String rest;

        private Literal(String rest) {
            this.rest = rest;
        }

        @Override
        public String rest() {
            return rest;
        }

    }
}
