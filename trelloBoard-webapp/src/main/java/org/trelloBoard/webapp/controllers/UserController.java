package org.trelloBoard.webapp.controllers;

import org.trelloBoard.model.Person;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("user")
public class UserController {

  @GET
  @Produces(MediaType.APPLICATION_JSON)
  public Person getPersonne() {
    return null;
  }

  @POST
  @Produces(MediaType.APPLICATION_JSON)
  public void setPersonne() {}
}
