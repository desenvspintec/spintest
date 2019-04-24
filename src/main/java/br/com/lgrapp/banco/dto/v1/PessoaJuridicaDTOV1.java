/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.lgrapp.banco.dto.v1;

import br.com.lgrapp.banco.dto.AbstractDTO;

/**
 *
 * @author adm
 */
public class PessoaJuridicaDTOV1 extends AbstractDTO<Integer> {

    private Integer idPessoaJuridica;
    private String dsNomeFantasia;
    private String dsRazaoSocial;
    private String dsCnpj;
    private String dsTelefone;
    private String dsEmail;

    @Override
    public Integer getId() {
        return idPessoaJuridica;
    }

    public Integer getIdPessoaJuridica() {
        return idPessoaJuridica;
    }

    public void setIdPessoaJuridica(Integer idPessoaJuridica) {
        this.idPessoaJuridica = idPessoaJuridica;
    }

    public String getDsNomeFantasia() {
        return dsNomeFantasia;
    }

    public void setDsNomeFantasia(String dsNomeFantasia) {
        this.dsNomeFantasia = dsNomeFantasia;
    }

    public String getDsRazaoSocial() {
        return dsRazaoSocial;
    }

    public void setDsRazaoSocial(String dsRazaoSocial) {
        this.dsRazaoSocial = dsRazaoSocial;
    }

    public String getDsCnpj() {
        return dsCnpj;
    }

    public void setDsCnpj(String dsCnpj) {
        this.dsCnpj = dsCnpj;
    }

    public String getDsTelefone() {
        return dsTelefone;
    }

    public void setDsTelefone(String dsTelefone) {
        this.dsTelefone = dsTelefone;
    }

    public String getDsEmail() {
        return dsEmail;
    }

    public void setDsEmail(String dsEmail) {
        this.dsEmail = dsEmail;
    }

}
