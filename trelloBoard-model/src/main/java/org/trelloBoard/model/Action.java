package org.trelloBoard.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Action {

  private String action_trello_id;
  private String action_name;
  private Integer board_id;
  private Integer list_id;
  private Integer card_id;
}
