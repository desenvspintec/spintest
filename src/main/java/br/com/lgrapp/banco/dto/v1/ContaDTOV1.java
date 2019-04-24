/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.lgrapp.banco.dto.v1;

import br.com.lgrapp.banco.dto.AbstractDTO;
import br.com.lgrapp.banco.enuns.TipoPessoaEnum;
import java.math.BigDecimal;
import java.util.Date;

/**
 *
 * @author adm
 */
public class ContaDTOV1 extends AbstractDTO<Integer> {

    private Integer idConta;
    private Integer idAgencia;
    private String dsAgencia;
    private Integer idPessoa;
    private String dsPessoa;
    private String dsCpfCnpj;
    private BigDecimal vrSaldo;
    private Date dtAbertura;
    private Date dtFechamento;

    private TipoPessoaEnum tipoPessoa;

    @Override
    public Integer getId() {
        return idConta;
    }

    public Integer getIdConta() {
        return idConta;
    }

    public void setIdConta(Integer idConta) {
        this.idConta = idConta;
    }

    public String getNrConta() {
        return idPessoa + "-" + idAgencia;
    }

    public String getDsAgencia() {
        return dsAgencia;
    }

    public void setDsAgencia(String dsAgencia) {
        this.dsAgencia = dsAgencia;
    }

    public String getDsPessoa() {
        return dsPessoa;
    }

    public void setDsPessoa(String dsPessoa) {
        this.dsPessoa = dsPessoa;
    }

    public String getDsCpfCnpj() {
        return dsCpfCnpj;
    }

    public void setDsCpfCnpj(String dsCpfCnpj) {
        this.dsCpfCnpj = dsCpfCnpj;
    }

    public BigDecimal getVrSaldo() {
        return vrSaldo;
    }

    public void setVrSaldo(BigDecimal vrSaldo) {
        this.vrSaldo = vrSaldo;
    }

    public Date getDtAbertura() {
        return dtAbertura;
    }

    public void setDtAbertura(Date dtAbertura) {
        this.dtAbertura = dtAbertura;
    }

    public Date getDtFechamento() {
        return dtFechamento;
    }

    public void setDtFechamento(Date dtFechamento) {
        this.dtFechamento = dtFechamento;
    }

    public Integer getIdPessoa() {
        return idPessoa;
    }

    public void setIdPessoa(Integer idPessoa) {
        this.idPessoa = idPessoa;
    }

    public TipoPessoaEnum getTipoPessoa() {
        return tipoPessoa;
    }

    public void setTipoPessoa(TipoPessoaEnum tipoPessoa) {
        this.tipoPessoa = tipoPessoa;
    }

    public Integer getIdAgencia() {
        return idAgencia;
    }

    public void setIdAgencia(Integer idAgencia) {
        this.idAgencia = idAgencia;
    }

}
