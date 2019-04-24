/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.lgrapp.banco.dao.v1.impl;

import br.com.lgrapp.banco.dao.AbstractDAO;
import br.com.lgrapp.banco.dao.v1.custom.IContaSaidaDAOV1;
import br.com.lgrapp.banco.model.ContaSaida;
import javax.ejb.Stateless;
import javax.inject.Named;

/**
 *
 * @author adm
 */
@Stateless
@Named("ContaSaidaDAOV1")
public class ContaSaidaDAOV1 extends AbstractDAO<ContaSaida> implements IContaSaidaDAOV1 {

    public ContaSaidaDAOV1() {
        super(ContaSaida.class);
    }
}
