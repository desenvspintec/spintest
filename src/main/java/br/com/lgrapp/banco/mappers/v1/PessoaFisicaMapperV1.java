/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.lgrapp.banco.mappers.v1;

import br.com.lgrapp.banco.dto.v1.PessoaFisicaDTOV1;
import br.com.lgrapp.banco.mappers.AbstractMapper;
import br.com.lgrapp.banco.model.PessoaFisica;
import br.com.lgrapp.banco.service.v1.custom.IPessoaFisicaServiceV1;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @author adm
 */
@Stateless
public class PessoaFisicaMapperV1 extends AbstractMapper<PessoaFisica, PessoaFisicaDTOV1> {

    @Inject
    @Named("PessoaFisicaServiceV1")
    private IPessoaFisicaServiceV1 pessoaFisicaServiceV1;

    @Override
    public PessoaFisicaDTOV1 convertToDto(PessoaFisica model) {
        PessoaFisicaDTOV1 dto = new PessoaFisicaDTOV1();
        dto.setDsCpf(model.getDsCpf());
        dto.setDsEmail(model.getDsEmail());
        dto.setDsNome(model.getDsNome());
        dto.setDsTelefone(model.getDsTelefone());
        dto.setDtNasc(model.getDtNasc());
        dto.setIdPessoaFisica(model.getIdPessoaFisica());
        return dto;
    }

    @Override
    public PessoaFisica convertToModel(PessoaFisica model, PessoaFisicaDTOV1 dto) {
        if (model == null) {
            if (dto.getId() != null) {
                model = pessoaFisicaServiceV1.find(dto.getIdPessoaFisica());
            } else {
                model = new PessoaFisica();
            }
        }
        model.setIdPessoaFisica(dto.getIdPessoaFisica());
        model.setDsCpf(dto.getDsCpf());
        model.setDsEmail(dto.getDsEmail());
        model.setDsNome(dto.getDsNome());
        model.setDsTelefone(dto.getDsTelefone());
        model.setDtNasc(dto.getDtNasc());
        return model;
    }

}
