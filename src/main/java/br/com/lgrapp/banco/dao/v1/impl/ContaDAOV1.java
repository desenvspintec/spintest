/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.lgrapp.banco.dao.v1.impl;

import br.com.lgrapp.banco.dao.AbstractDAO;
import br.com.lgrapp.banco.dao.v1.custom.IContaDAOV1;
import br.com.lgrapp.banco.dto.v1.ContaDTOV1;
import br.com.lgrapp.banco.model.Conta;
import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Named;
import javax.persistence.Query;

/**
 *
 * @author adm
 */
@Stateless
@Named("ContaDAOV1")
public class ContaDAOV1 extends AbstractDAO<Conta> implements IContaDAOV1 {

    public ContaDAOV1() {
        super(Conta.class);
    }

    @Override
    public List<Conta> findByDsPessoa(String dsPessoa) {
        Query query = getEntityManager().createQuery("select c from Conta c  "
                + " where (c.idPessoaFisica.dsNome like ':dsPessoa%') "
                + " or (c.idPessoaJuridica.dsNomeFantasia like ':dsPessoa%') "
                + " or (c.idPessoaJuridica.dsRazaoSocial like ':dsPessoa%') ");
        return query.getResultList();
    }

    @Override
    public Conta find(Object id) {
        Query query = getEntityManager().createNamedQuery("Conta.findByIdConta");
        query.setParameter("idConta", id);
        return (Conta)query.getSingleResult();
    }
    

}
