/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.lgrapp.banco.mappers;

import br.com.lgrapp.banco.base.crud.AbstractEntity;
import br.com.lgrapp.banco.dto.AbstractDTO;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author adm
 */
public abstract class AbstractMapper<T extends AbstractEntity, S extends AbstractDTO> {

    public abstract S convertToDto(T model);

    public abstract T convertToModel(T model, S dto);

    public List<S> convertToDtoList(List<T> models) {
        List<S> dtos = new ArrayList<>();
        for (T model : models) {
            dtos.add(convertToDto(model));
        }
        return dtos;
    }

}
