package org.trelloBoard.model.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class CardEntity {

  @Id private Integer list;
  @Column private String card_name;
  @Column private String card_trello_id;
  @Column private String start_processing;
  @Column private Integer effort;
  @Column private Integer effort_done;
  @Column private boolean closed;
  @Column private Integer personnes;
  @Column private Integer sprint_id;
}
