package org.trelloBoard.model.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ActionEntity {

  @Id private String action_trello_id;
  @Column private String action_name;
  @Column private Integer board_id;
  @Column private Integer list_id;
  @Column private Integer card_id;
}
