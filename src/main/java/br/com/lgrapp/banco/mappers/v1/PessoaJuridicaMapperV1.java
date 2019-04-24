/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.lgrapp.banco.mappers.v1;

import br.com.lgrapp.banco.dto.v1.PessoaJuridicaDTOV1;
import br.com.lgrapp.banco.mappers.AbstractMapper;
import br.com.lgrapp.banco.model.PessoaJuridica;
import br.com.lgrapp.banco.service.v1.custom.IPessoaJuridicaServiceV1;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @author adm
 */
@Stateless
public class PessoaJuridicaMapperV1 extends AbstractMapper<PessoaJuridica, PessoaJuridicaDTOV1> {

    @Inject
    @Named("PessoaJuridicaServiceV1")
    private IPessoaJuridicaServiceV1 pessoaJuridicaServiceV1;

    @Override
    public PessoaJuridicaDTOV1 convertToDto(PessoaJuridica model) {
        PessoaJuridicaDTOV1 dto = new PessoaJuridicaDTOV1();
        dto.setDsCnpj(model.getDsCnpj());
        dto.setDsEmail(model.getDsEmail());
        dto.setDsNomeFantasia(model.getDsNomeFantasia());
        dto.setDsRazaoSocial(model.getDsRazaoSocial());
        dto.setDsTelefone(model.getDsTelefone());
        dto.setIdPessoaJuridica(model.getIdPessoaJuridica());
        return dto;
    }

    @Override
    public PessoaJuridica convertToModel(PessoaJuridica model, PessoaJuridicaDTOV1 dto) {
        if (model == null) {
            if (dto.getIdPessoaJuridica() != null) {
                model = pessoaJuridicaServiceV1.find(dto.getId());
            } else {
                model = new PessoaJuridica();
            }

        }
        model.setDsCnpj(dto.getDsCnpj());
        model.setDsEmail(dto.getDsEmail());
        model.setDsNomeFantasia(dto.getDsNomeFantasia());
        model.setDsRazaoSocial(dto.getDsRazaoSocial());
        model.setDsTelefone(dto.getDsTelefone());
        model.setIdPessoaJuridica(dto.getIdPessoaJuridica());
        return model;
    }

}
