package org.trelloBoard.business.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.trelloBoard.consumer.SprintConsumer;
import org.trelloBoard.model.Sprint;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class SprintService {

  private final SprintConsumer getSprint;

  @Autowired
  public SprintService(SprintConsumer getSprint) {
    this.getSprint = getSprint;
  }

    public List<Sprint> getSprintFromDB() {

    	List<Sprint> sprintList = this.getSprint.getSprintConsumer();
    	return sprintList;
    	//      return this.getSprint.getSprintConsumer();
    }
}
