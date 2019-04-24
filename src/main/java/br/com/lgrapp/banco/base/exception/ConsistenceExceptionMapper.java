/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.lgrapp.banco.base.exception;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

/**
 *
 * @author adm
 */
@Provider
public class ConsistenceExceptionMapper implements ExceptionMapper<ConsistenceException> {

    @Override
    public Response toResponse(ConsistenceException exception) {
        String trace = "";
        exception.getLocalizedMessage();
        for (StackTraceElement element : exception.getStackTrace()) {
            trace += element.getFileName() + " (" + element.getClassName() + ") " + element.getMethodName() + " " + element.getLineNumber() + "\n";
        }
        return Response.status(311).header("content-type", "application/json").entity(new ResponseException(exception.getMessage(), trace)).build();
    }

}
