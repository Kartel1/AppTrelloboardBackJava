package org.trelloBoard.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Organization {

  private String organization_trello_id;
  private String organization_name;
}
