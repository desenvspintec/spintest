/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.lgrapp.banco.dao.v1.impl;

import br.com.lgrapp.banco.dao.AbstractDAO;
import br.com.lgrapp.banco.dao.v1.custom.IPessoaJuridicaDAOV1;
import br.com.lgrapp.banco.model.PessoaJuridica;
import javax.ejb.Stateless;
import javax.inject.Named;

/**
 *
 * @author adm
 */
@Stateless
@Named("PessoaJuridicaDAOV1")
public class PessoaJuridicaDAOV1 extends AbstractDAO<PessoaJuridica> implements IPessoaJuridicaDAOV1 {

    public PessoaJuridicaDAOV1() {
        super(PessoaJuridica.class);
    }
}
