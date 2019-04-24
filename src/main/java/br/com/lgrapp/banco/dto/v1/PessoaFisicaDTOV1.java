/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.lgrapp.banco.dto.v1;

import br.com.lgrapp.banco.dto.AbstractDTO;
import java.util.Date;

/**
 *
 * @author adm
 */
public class PessoaFisicaDTOV1 extends AbstractDTO<Integer> {

    private Integer idPessoaFisica;
    private String dsNome;
    private Date dtNasc;
    private String dsCpf;
    private String dsEmail;
    private String dsTelefone;

    public Integer getIdPessoaFisica() {
        return idPessoaFisica;
    }

    public void setIdPessoaFisica(Integer idPessoaFisica) {
        this.idPessoaFisica = idPessoaFisica;
    }

    public String getDsNome() {
        return dsNome;
    }

    public void setDsNome(String dsNome) {
        this.dsNome = dsNome;
    }

    public Date getDtNasc() {
        return dtNasc;
    }

    public void setDtNasc(Date dtNasc) {
        this.dtNasc = dtNasc;
    }

    public String getDsCpf() {
        return dsCpf;
    }

    public void setDsCpf(String dsCpf) {
        this.dsCpf = dsCpf;
    }

    public String getDsEmail() {
        return dsEmail;
    }

    public void setDsEmail(String dsEmail) {
        this.dsEmail = dsEmail;
    }

    public String getDsTelefone() {
        return dsTelefone;
    }

    public void setDsTelefone(String dsTelefone) {
        this.dsTelefone = dsTelefone;
    }

    @Override
    public Integer getId() {
        return idPessoaFisica;
    }

}
