package org.trelloBoard.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CardTracking {

  private Integer card;
  private Integer effort_remaining;
  private Integer day_of_sprint;
}
