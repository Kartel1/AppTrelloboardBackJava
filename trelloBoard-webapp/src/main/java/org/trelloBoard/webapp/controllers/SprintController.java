package org.trelloBoard.webapp.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.trelloBoard.business.SprintService;
import org.trelloBoard.model.Sprint;

@RestController
@RequestMapping("trelloBoard-webapp/webapi")
public class SprintController {

  private final SprintService sprintService;

  @Autowired
  public SprintController(SprintService sprintService) {
    this.sprintService = sprintService;
  }

  @GetMapping(value = "sprint")
  public List<Sprint> getIt() {
    return sprintService.getSprintFromDB();
  }
}
