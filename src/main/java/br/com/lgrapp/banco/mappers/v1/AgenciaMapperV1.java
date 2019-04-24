/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.lgrapp.banco.mappers.v1;

import br.com.lgrapp.banco.dto.v1.AgenciaDTOV1;
import br.com.lgrapp.banco.mappers.AbstractMapper;
import br.com.lgrapp.banco.model.Agencia;
import javax.ejb.Stateless;
import javax.inject.Named;

/**
 *
 * @author adm
 */
@Stateless
public class AgenciaMapperV1 extends AbstractMapper<Agencia, AgenciaDTOV1> {

    @Override
    public AgenciaDTOV1 convertToDto(Agencia model) {
        AgenciaDTOV1 dto = new AgenciaDTOV1();
        dto.setDsAgencia(model.getDsAgencia());
        dto.setIdAgencia(model.getIdAgencia());
        return dto;
    }

    @Override
    public Agencia convertToModel(Agencia model, AgenciaDTOV1 dto) {
        if (model == null) {
            model = new Agencia();
        }
        model.setDsAgencia(dto.getDsAgencia());
        model.setIdAgencia(dto.getIdAgencia());
        return model;
    }

}
