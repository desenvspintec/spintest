/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.spin.spintest.controller.v1;

import br.com.spin.spintest.model.CentralCompany;
import br.com.spin.spintest.service.v1.CentralCompanyServiceV1;
import java.util.List;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author adm
 */
@Path("v1/centralcompany")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class CentralCompanyControllerV1 {

    @Inject
    private CentralCompanyServiceV1 centralCompanyServiceV1;

    @GET
    public List<CentralCompany> findAll() {
        return centralCompanyServiceV1.findAll();
    }

    @GET
    @Path("{id}")
    public CentralCompany findById(@PathParam("id") Integer id) {
        return centralCompanyServiceV1.find(id);
    }

    @POST
    public CentralCompany save(CentralCompany centralCompany) {
        centralCompanyServiceV1.save(centralCompany);
        return centralCompany;
    }

}
