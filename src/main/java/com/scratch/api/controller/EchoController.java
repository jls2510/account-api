package com.scratch.api.controller;

import com.scratch.util.GenericResponseModel;

import org.glassfish.jersey.server.ContainerRequest;

import javax.ws.rs.*;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("")
public class EchoController {

    @Context
    private ContainerRequest containerRequest;

    @GET
    @Path("echo/{message}")
    @Consumes(MediaType.TEXT_PLAIN)
    @Produces(MediaType.APPLICATION_JSON)
    public Response getEcho(@PathParam("message") String message) {

        Response response = Response.ok(new GenericResponseModel(true, null, null, null, message, null)).build();

        return response;
    }



}
