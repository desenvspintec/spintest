/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.lgrapp.banco.facade.v1.custom;

import br.com.lgrapp.banco.base.crud.interfaces.ICrud;
import br.com.lgrapp.banco.dto.v1.ContaDTOV1;
import java.util.List;

/**
 *
 * @author adm
 */
public interface IContaFacadeV1 extends ICrud<ContaDTOV1> {

    void savePessoaFisica(ContaDTOV1 dto);

    void savePessoaJuridica(ContaDTOV1 dto);

    List<ContaDTOV1> findByDsPessoa(String dsPessoa);
    
}
