/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.lgrapp.banco.service.v1.custom;

import br.com.lgrapp.banco.base.crud.interfaces.ICrud;
import br.com.lgrapp.banco.dto.v1.ContaDTOV1;
import br.com.lgrapp.banco.model.Conta;
import java.util.List;

/**
 *
 * @author adm
 */
public interface IContaServiceV1 extends ICrud<Conta> {

    List<Conta> findByDsPessoa(String dsPessoa);
}
