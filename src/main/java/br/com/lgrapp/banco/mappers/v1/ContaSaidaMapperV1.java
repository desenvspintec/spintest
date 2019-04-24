/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.lgrapp.banco.mappers.v1;

import br.com.lgrapp.banco.dto.v1.ContaSaidaDTOV1;
import br.com.lgrapp.banco.mappers.AbstractMapper;
import br.com.lgrapp.banco.model.ContaSaida;
import br.com.lgrapp.banco.service.v1.custom.IContaServiceV1;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @author adm
 */
@Stateless
public class ContaSaidaMapperV1 extends AbstractMapper<ContaSaida, ContaSaidaDTOV1> {

    @Inject
    @Named("ContaServiceV1")
    private IContaServiceV1 contaServiceV1;

    @Override
    public ContaSaidaDTOV1 convertToDto(ContaSaida model) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ContaSaida convertToModel(ContaSaida model, ContaSaidaDTOV1 dto) {
        if (model == null) {
            model = new ContaSaida();
        }
        model.setIdContaSaida(dto.getIdContaSaida());
        model.setVrOperacao(dto.getVrOperacao());
        model.setIdConta(contaServiceV1.find(dto.getIdConta()));
        return model;
    }

}
