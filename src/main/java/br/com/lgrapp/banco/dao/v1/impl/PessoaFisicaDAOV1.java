/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.lgrapp.banco.dao.v1.impl;

import br.com.lgrapp.banco.dao.AbstractDAO;
import br.com.lgrapp.banco.dao.v1.custom.IPessoaFisicaDAOV1;
import br.com.lgrapp.banco.model.PessoaFisica;
import javax.ejb.Stateless;
import javax.inject.Named;

/**
 *
 * @author adm
 */
@Stateless
@Named("PessoaFisicaDAOV1")
public class PessoaFisicaDAOV1 extends AbstractDAO<PessoaFisica> implements IPessoaFisicaDAOV1 {

    public PessoaFisicaDAOV1() {
        super(PessoaFisica.class);
    }
}
