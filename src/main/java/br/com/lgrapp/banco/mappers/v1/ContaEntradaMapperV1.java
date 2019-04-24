/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.lgrapp.banco.mappers.v1;

import br.com.lgrapp.banco.dto.v1.ContaEntradaDTOV1;
import br.com.lgrapp.banco.mappers.AbstractMapper;
import br.com.lgrapp.banco.model.ContaEntrada;
import br.com.lgrapp.banco.service.v1.custom.IContaServiceV1;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @author adm
 */
@Stateless
public class ContaEntradaMapperV1 extends AbstractMapper<ContaEntrada, ContaEntradaDTOV1> {

    @Inject
    @Named("ContaServiceV1")
    private IContaServiceV1 contaServiceV1;

    @Override
    public ContaEntradaDTOV1 convertToDto(ContaEntrada model) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ContaEntrada convertToModel(ContaEntrada model, ContaEntradaDTOV1 dto) {
        if (model == null) {
            model = new ContaEntrada();
        }
        model.setIdConta(contaServiceV1.find(dto.getIdConta()));
        model.setIdContaEntrada(dto.getIdContaEntrada());
        model.setVrOperacao(dto.getVrOperacao());
        return model;
    }

}
