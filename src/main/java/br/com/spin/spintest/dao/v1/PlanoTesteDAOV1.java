/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.spin.spintest.dao.v1;

import br.com.spin.spintest.base.AbstractDAO;
import javax.ejb.Stateless;
import br.com.spin.spintest.model.PlanoTeste;
/**
 *
 * @author adm
 */
@Stateless
public class PlanoTesteDAOV1 extends AbstractDAO<PlanoTeste> {

    public PlanoTesteDAOV1() {
        super(PlanoTeste.class);
    }

 

}
