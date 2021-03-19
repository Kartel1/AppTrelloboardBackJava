package org.trelloBoard.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Board {

  private String board_name;
  private String board_trello_id;
  private String board_short_url;
  private Integer board_organization_id;
}
