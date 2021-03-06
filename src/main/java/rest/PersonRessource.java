/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rest;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import facades.Facade;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * REST Web Service
 *
 * @author thomas
 */
@Path("person")
public class PersonRessource {
    @Context
    private UriInfo context;

    private Gson gson = new GsonBuilder().setPrettyPrinting().create();
    private Facade facade = new Facade();
    /**
     * Creates a new instance of PersonRessource
     */
    public PersonRessource() {
    }

    /**
     * Retrieves representation of an instance of rest.PersonRessource
     * @return an instance of java.lang.String
     */
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getPersons() {
        return Response.ok().entity(gson.toJson(facade.getAllPersons())).build();
    }

    /**
     * PUT method for updating or creating an instance of PersonRessource
     * @param content representation for the resource
     */
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public void putJson(String content) {
    }
}
