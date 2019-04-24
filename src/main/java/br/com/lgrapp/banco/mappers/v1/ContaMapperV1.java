/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.lgrapp.banco.mappers.v1;

import br.com.lgrapp.banco.dto.v1.ContaDTOV1;
import br.com.lgrapp.banco.enuns.TipoPessoaEnum;
import br.com.lgrapp.banco.mappers.AbstractMapper;
import br.com.lgrapp.banco.model.Conta;
import br.com.lgrapp.banco.service.v1.custom.IAgenciaServiceV1;
import br.com.lgrapp.banco.service.v1.custom.IPessoaFisicaServiceV1;
import br.com.lgrapp.banco.service.v1.custom.IPessoaJuridicaServiceV1;
import java.math.BigDecimal;
import java.util.Date;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @author adm
 */
@Stateless
public class ContaMapperV1 extends AbstractMapper<Conta, ContaDTOV1> {

    @Inject
    @Named("AgenciaServiceV1")
    private IAgenciaServiceV1 agenciaServiceV1;

    @Inject
    @Named("PessoaJuridicaServiceV1")
    private IPessoaJuridicaServiceV1 pessoaJuridicaServiceV1;

    @Inject
    @Named("PessoaFisicaServiceV1")
    private IPessoaFisicaServiceV1 pessoaFisicaServiceV1;

    @Override
    public ContaDTOV1 convertToDto(Conta model) {
        ContaDTOV1 dto = new ContaDTOV1();
        dto.setIdConta(model.getIdConta());
        dto.setIdAgencia(model.getIdAgencia().getIdAgencia());
        dto.setDsAgencia(model.getIdAgencia().getDsAgencia());
        dto.setVrSaldo(model.getVrSaldo());
        dto.setDtAbertura(model.getDtAbertura());
        if (model.getIdPessoaFisica() != null) {
            dto.setDsCpfCnpj(model.getIdPessoaFisica().getDsCpf());
            dto.setDsPessoa(model.getIdPessoaFisica().getDsNome());
            dto.setIdPessoa(model.getIdPessoaFisica().getIdPessoaFisica());
            dto.setTipoPessoa(TipoPessoaEnum.PESSOA_FISICA);
        } else if (model.getIdPessoaJuridica() != null) {
            dto.setDsCpfCnpj(model.getIdPessoaJuridica().getDsCnpj());
            dto.setDsPessoa(model.getIdPessoaJuridica().getDsRazaoSocial());
            dto.setIdPessoa(model.getIdPessoaJuridica().getIdPessoaJuridica());
            dto.setTipoPessoa(TipoPessoaEnum.PESSOA_JURIDICA);
        }
        return dto;
    }

    @Override
    public Conta convertToModel(Conta model, ContaDTOV1 dto) {
        if (model == null) {
            model = new Conta();
        }
        model.setDtAbertura(new Date());
        model.setDtFechamento(null);
        model.setIdAgencia(agenciaServiceV1.find(dto.getIdAgencia()));
        model.setIdConta(null);

        if (TipoPessoaEnum.PESSOA_FISICA.equals(dto.getTipoPessoa())) {
            model.setIdPessoaFisica(pessoaFisicaServiceV1.find(dto.getIdPessoa()));
        } else if (TipoPessoaEnum.PESSOA_JURIDICA.equals(dto.getTipoPessoa())) {
            model.setIdPessoaJuridica(pessoaJuridicaServiceV1.find(dto.getIdPessoa()));
        }
        model.setVrSaldo(new BigDecimal(0d));

        return model;
    }

}
