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
public abstract class AbstractService<T> implements CrudInterface<T> {

    public abstract AbstractDAO getAbstractDAO();

    @Override
    public void insert(T entity) {
        getAbstractDAO().insert(entity);
    }

    @Override
    public void update(T entity) {
        getAbstractDAO().update(entity);
    }

    @Override
    public void save(T entity) {
        getAbstractDAO().save(entity);
    }

    @Override
    public void delete(T entity) {
        getAbstractDAO().delete(entity);
    }

    @Override
    public T find(Object id) {
        return (T) getAbstractDAO().find(id);
    }

    @Override
    public List<T> findAll() {
        return getAbstractDAO().findAll();
    }

}
