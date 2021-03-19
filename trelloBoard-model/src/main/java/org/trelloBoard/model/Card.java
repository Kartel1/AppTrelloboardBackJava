package org.trelloBoard.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Card {

  private Integer list;
  private String card_name;
  private String card_trello_id;
  private String start_processing;
  private Integer effort;
  private Integer effort_done;
  private boolean closed;
  private Integer personnes;
  private Integer sprint_id;
}
