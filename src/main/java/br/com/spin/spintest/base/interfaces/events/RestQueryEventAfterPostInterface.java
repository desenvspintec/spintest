/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.spin.spintest.base.interfaces.events;

/**
 *
 * @author lucas
 */
public interface RestQueryEventAfterPostInterface<T> {
    
     void afterPost(T entity);
}
