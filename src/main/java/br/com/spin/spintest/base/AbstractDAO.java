/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.spin.spintest.base;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaQuery;

/**
 *
 * @author adm
 */
public abstract class AbstractDAO<T> implements CrudInterface<T> { 

    @PersistenceContext
    private EntityManager entityManager;

    private Class<T> entityClass;

    public AbstractDAO(Class<T> entityClass) {
        this.entityClass = entityClass;
    }

    public EntityManager getEntityManager() {
        return entityManager;
    }

    @Override
    public void insert(T entity) {
        getEntityManager().persist(entity);
        getEntityManager().flush();
    }

    @Override
    public void update(T entity) {
        getEntityManager().merge(entity);
        getEntityManager().flush();
    }

    @Override
    public void save(T entity) {
        if (((SAbstractEntity) entity).getId() == null) {
            insert(entity);
        } else {
            update(entity);
        }
    }

    @Override
    public void delete(T entity) {
        getEntityManager().remove(getEntityManager().merge(entity));
    }

    @Override
    public T find(Object id) {
        return getEntityManager().find(entityClass, id);
    }

    @Override
    public List<T> findAll() {
        CriteriaQuery cq = getEntityManager().getCriteriaBuilder().createQuery();
        cq.select(cq.from(entityClass));
        return getEntityManager().createQuery(cq).getResultList();
    }

}
