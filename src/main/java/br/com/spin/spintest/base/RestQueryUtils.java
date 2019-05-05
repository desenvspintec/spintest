/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.spin.spintest.base;

import br.com.spin.spintest.base.annotations.RestQuery;
import br.com.spin.spintest.base.annotations.RestQueryBeforePost;
import br.com.spin.spintest.base.exception.restquery.RestQueryBeforPostNotImplemented;
import br.com.spin.spintest.base.exception.restquery.RestQueryNotFountException;
import br.com.spin.spintest.base.interfaces.events.RestQueryEventBeforePostInterface;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.net.InterfaceAddress;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.enterprise.inject.spi.CDI;
import javax.inject.Inject;
import org.hibernate.internal.util.ReflectHelper;
import org.reflections.Reflections;

/**
 *
 * @author lucas
 */
public class RestQueryUtils {

    public static Class<?> findModelClass(String rest) {
        Set<Class<?>> classes = new Reflections("br.com.spin.spintest.model").getTypesAnnotatedWith(RestQuery.class);
        for (Class<?> classe : classes) {
            for (Annotation annotation : classe.getAnnotations()) {
                if (annotation instanceof RestQuery) {
                    if (((RestQuery) annotation).rest().equalsIgnoreCase(rest)) {
                        return (Class) classe;
                    }
                }
            }
        }

        throw new RestQueryNotFountException(rest);
    }

    public static Class<?> findBeforePostClass(String rest) {
        Set<Class<?>> classes = new Reflections("br.com.spin.spintest.events").getTypesAnnotatedWith(RestQueryBeforePost.class);
        for (Class<?> classe : classes) {
            for (Annotation annotation : classe.getAnnotations()) {
                if (annotation instanceof RestQueryBeforePost) {
                    if (((RestQueryBeforePost) annotation).rest().equalsIgnoreCase(rest)) {
                        if (!ReflectHelper.implementsInterface(classe, RestQueryEventBeforePostInterface.class)) {
                            throw new RestQueryBeforPostNotImplemented(rest);
                        }
                        return (Class) classe;
                    }
                }
            }
        }

        return null;
    }

    public static void setInjections(Object obj) {

        for (Field field : obj.getClass().getDeclaredFields()) {
            for (Annotation annotation : field.getAnnotations()) {
                if (annotation instanceof Inject) {
                    try {
                        field.setAccessible(true);
                        field.set(obj, CDI.current().select(field.getType()).get());
                    } catch (IllegalArgumentException ex) {
                        Logger.getLogger(RestQueryUtils.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (IllegalAccessException ex) {
                        Logger.getLogger(RestQueryUtils.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        }
    }

}
