/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.spin.spintest.dao.v1;

import br.com.spin.spintest.base.AbstractDAO;
import br.com.spin.spintest.model.CentralCompany;
import javax.ejb.Stateless;

/**
 *
 * @author adm
 */
@Stateless
public class CentralCompanyDAOV1 extends AbstractDAO<CentralCompany> {

    public CentralCompanyDAOV1() {
        super(CentralCompany.class);
    }

}
