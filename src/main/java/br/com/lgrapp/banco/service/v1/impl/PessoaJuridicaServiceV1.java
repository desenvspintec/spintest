/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.lgrapp.banco.service.v1.impl;



import br.com.lgrapp.banco.dao.v1.custom.IPessoaJuridicaDAOV1;
import br.com.lgrapp.banco.model.PessoaJuridica;
import br.com.lgrapp.banco.service.AbstractService;
import br.com.lgrapp.banco.service.v1.custom.IPessoaJuridicaServiceV1;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @author adm
 */
@Stateless
@Named("PessoaJuridicaServiceV1")
public class PessoaJuridicaServiceV1 extends AbstractService<PessoaJuridica> implements IPessoaJuridicaServiceV1 {

    @Inject
    @Named("PessoaJuridicaDAOV1")
    private IPessoaJuridicaDAOV1 pessoaJuridicaDAOV1;

    @Override
    public IPessoaJuridicaDAOV1 getCrud() {
        return pessoaJuridicaDAOV1;
    }
    
    
}
