package org.trelloBoard.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Person {

  private Integer id;
  private String usager;
  private String user_infos;
  private String user_logo;
  private String slug;
  private String organizations;
  private String trello_id;
  private boolean has_random_password;
}
