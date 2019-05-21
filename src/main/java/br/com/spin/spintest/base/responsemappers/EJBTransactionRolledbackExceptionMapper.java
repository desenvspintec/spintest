/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.spin.spintest.base.responsemappers;

import br.com.spin.spintest.base.responsemappers.model.ResponseMapper;
import javax.ejb.EJBTransactionRolledbackException;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

/**
 *
 * @author lucas
 */
@Provider
public class EJBTransactionRolledbackExceptionMapper implements ExceptionMapper<EJBTransactionRolledbackException> {

    @Override
    public Response toResponse(EJBTransactionRolledbackException exception) {
        return Response.status(400).entity(new ResponseMapper(exception.getMessage())).build();
    }

}
