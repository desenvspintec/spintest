/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.lgrapp.banco.facade;

import br.com.lgrapp.banco.base.crud.AbstractEntity;
import br.com.lgrapp.banco.base.crud.interfaces.ICrud;
import br.com.lgrapp.banco.dto.AbstractDTO;
import br.com.lgrapp.banco.mappers.AbstractMapper;
import java.util.List;

/**
 *
 * @author adm
 */
public abstract class AbstractFacade<T extends AbstractEntity, S extends AbstractDTO> {

    public void create(S dto) {
        getCrud().create(getMapper().convertToModel(null, dto));
    }

    public void edit(S dto) {
        getCrud().edit(getMapper().convertToModel(null, dto));
    }

    public void save(S dto) {
        getCrud().save(getMapper().convertToModel(null, dto));
    }

    public void save(T entity, S dto) {
        getCrud().save(getMapper().convertToModel(entity, dto));
    }

    public void remove(Object id) {
        getCrud().remove(id);
    }

    public S find(Object id) {
        return getMapper().convertToDto((T) getCrud().find(id));
    }

    public List<S> findAll() {
        return getMapper().convertToDtoList(getCrud().findAll());
    }

    public List<S> findRange(int first, int max) {
        return getMapper().convertToDtoList(getCrud().findRange(first, max));
    }

    public int count() {
        return getCrud().count();
    }

    public abstract ICrud getCrud();

    public abstract AbstractMapper<T, S> getMapper();

}
