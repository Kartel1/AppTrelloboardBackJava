package org.trelloBoard.consumer;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.trelloBoard.consumer.repositories.SprintRepository;
import org.trelloBoard.model.Sprint;

@Component
public class SprintConsumer {

  private final SprintRepository sprintRepository;

  @Autowired
  public SprintConsumer(SprintRepository sprintRepository) {
    this.sprintRepository = sprintRepository;
  }

  public List<Sprint> getSprintConsumer() {

    List<Sprint> sprints =
        this.sprintRepository
            .findAll()
            .stream()
            .map(
                s ->
                    Sprint.builder()
                        .id(s.getId())
                        .sprintNumber(s.getSprintNumber())
                        .endDate(s.getEndDate().toString())
                        .startDate(s.getStartDate().toString())
                        .numberOfTasks(s.getNumberOfTasks())
                        .build())
            .collect(Collectors.toList());
    return sprints;
  }
}
