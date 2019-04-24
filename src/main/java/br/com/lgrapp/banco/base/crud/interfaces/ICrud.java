/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.lgrapp.banco.base.crud.interfaces;

import br.com.lgrapp.banco.base.crud.AbstractEntity;
import java.util.List;

/**
 *
 * @author adm
 */
public interface ICrud<T> {

    public void create(T entity);

    public void edit(T entity);

    public void remove(Object id);

    public T find(Object id);

    public List<T> findAll();
    
    public List<T> findRange(int first, int max);

    public int count();
    
    public void save(T entity);
}
