package org.trelloBoard.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Tag {

  private String tag_trello_id;
  private String tag_name;
  private Integer card_id;
  private String tag_type;
}
