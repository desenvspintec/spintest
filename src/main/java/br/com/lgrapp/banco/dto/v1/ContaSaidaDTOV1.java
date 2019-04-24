/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.lgrapp.banco.dto.v1;

import br.com.lgrapp.banco.dto.AbstractDTO;
import java.math.BigDecimal;

/**
 *
 * @author adm
 */
public class ContaSaidaDTOV1 extends AbstractDTO<Integer> {

    private Integer idContaSaida;
    private BigDecimal vrOperacao;
    private Integer idConta;

    public Integer getIdContaSaida() {
        return idContaSaida;
    }

    public void setIdContaSaida(Integer idContaSaida) {
        this.idContaSaida = idContaSaida;
    }

    @Override
    public Integer getId() {
        return idContaSaida;
    }

    public BigDecimal getVrOperacao() {
        return vrOperacao;
    }

    public void setVrOperacao(BigDecimal vrOperacao) {
        this.vrOperacao = vrOperacao;
    }

    public Integer getIdConta() {
        return idConta;
    }

    public void setIdConta(Integer idConta) {
        this.idConta = idConta;
    }

}
