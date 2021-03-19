package org.trelloBoard.webapp.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.trelloBoard.business.SprintService;
import org.trelloBoard.model.Sprint;

import com.fasterxml.jackson.core.JacksonException;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

/** Root resource (exposed at "myresource" path) */
@Path("sprint")
public class SprintController {

  @Autowired private SprintService getSprintService;

  /**
   * Method handling HTTP GET requests. The returned object will be sent to the client as
   * "text/plain" media type.
   *
   * @return String that will be returned as a text/plain response.
   * @throws JacksonException
   */
  @GET
  @Produces(MediaType.APPLICATION_JSON)
  public List<Sprint> getIt() {
    return getSprintService.getSprintFromDB();
  }
}
