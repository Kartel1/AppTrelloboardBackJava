package org.trelloBoard.webapp.controllers;

import org.trelloBoard.model.Card;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("card")
public class CardController {

  @GET
  @Produces(MediaType.APPLICATION_JSON)
  public Card getCard() {
    return null;
  }

  @POST
  @Produces(MediaType.APPLICATION_JSON)
  public Card setCard() {
    return null;
  }
}
