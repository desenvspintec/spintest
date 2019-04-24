/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.lgrapp.banco.dao.v1.impl;

import br.com.lgrapp.banco.dao.AbstractDAO;
import br.com.lgrapp.banco.dao.v1.custom.IAgenciaDAOV1;
import br.com.lgrapp.banco.model.Agencia;
import javax.ejb.Stateless;
import javax.inject.Named;

/**
 *
 * @author adm
 */
@Stateless
@Named("AgenciaDAOV1")
public class AgenciaDAOV1 extends AbstractDAO<Agencia> implements IAgenciaDAOV1 {

    public AgenciaDAOV1() {
        super(Agencia.class);
    }

}
