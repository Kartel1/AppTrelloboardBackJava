package org.trelloBoard.model.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class BoardEntity {

  @Id private String board_name;
  @Column private String board_trello_id;
  @Column private String board_short_url;
  @Column private Integer board_organization_id;
}
