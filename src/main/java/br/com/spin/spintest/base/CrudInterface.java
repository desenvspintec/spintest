/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.spin.spintest.base;

import java.util.List;

/**
 *
 * @author lucas
 */
public interface CrudInterface<T> {

    public void insert(T entity);

    public void update(T entity);

    public void save(T entity);

    public void delete(T entity);

    public T find(Object id);

    public List<T> findAll();
}
