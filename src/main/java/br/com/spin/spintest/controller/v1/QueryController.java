/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.spin.spintest.controller.v1;

import br.com.spin.spintest.service.v1.QueryServiceV1;
import java.util.Map;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;

/**
 *
 * @author lucas
 */
@Path("v1/query")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class QueryController {

    @Inject
    private QueryServiceV1 queryServiceV1;

    @GET
    @Path("{rest}")
    public Response query(@PathParam("rest") String rest, @Context UriInfo uriInfo) {
        MultivaluedMap<String, String> query = uriInfo.getQueryParameters();
        return Response.ok(queryServiceV1.query(rest, query)).build();
    }

    @GET
    @Path("{rest}/{id}")
    public Response queryById(@PathParam("rest") String rest, @PathParam("id") String id) {
        return Response.ok(queryServiceV1.queryById(rest, id)).build();
    }

    @POST
    @Path("{rest}")
    public Response save(@PathParam("rest") String rest, Map body) {
        return Response.ok(queryServiceV1.save(rest, body)).build();
    }

}
