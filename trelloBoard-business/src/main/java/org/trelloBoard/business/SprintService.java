package org.trelloBoard.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.trelloBoard.consumer.SprintConsumer;
import org.trelloBoard.model.Sprint;

@Service
public class SprintService {

  private final SprintConsumer getSprint;

  @Autowired
  public SprintService(SprintConsumer getSprint) {
    this.getSprint = getSprint;
  }

    public List<Sprint> getSprintFromDB() {
      return this.getSprint.getSprintConsumer();
    }
}
