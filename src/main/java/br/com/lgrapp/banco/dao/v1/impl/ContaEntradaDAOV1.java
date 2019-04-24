/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.lgrapp.banco.dao.v1.impl;

import br.com.lgrapp.banco.dao.AbstractDAO;
import br.com.lgrapp.banco.model.ContaEntrada;
import javax.ejb.Stateless;
import javax.inject.Named;
import br.com.lgrapp.banco.dao.v1.custom.IContaEntradaDAOV1;

/**
 *
 * @author adm
 */
@Stateless
@Named("ContaEntradaDAOV1")
public class ContaEntradaDAOV1 extends AbstractDAO<ContaEntrada> implements IContaEntradaDAOV1 {

    public ContaEntradaDAOV1() {
        super(ContaEntrada.class);
    }

}
