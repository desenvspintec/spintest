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
public class AgenciaDTOV1 extends AbstractDTO<Integer>{

    private Integer idAgencia;
    private String dsAgencia;

    @Override
    public Integer getId() {
        return idAgencia;
    }

    public Integer getIdAgencia() {
        return idAgencia;
    }

    public void setIdAgencia(Integer idAgencia) {
        this.idAgencia = idAgencia;
    }

    public String getDsAgencia() {
        return dsAgencia;
    }

    public void setDsAgencia(String dsAgencia) {
        this.dsAgencia = dsAgencia;
    }

}
