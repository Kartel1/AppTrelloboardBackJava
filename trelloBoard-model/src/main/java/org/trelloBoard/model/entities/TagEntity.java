package org.trelloBoard.model.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class TagEntity {

  @Id private String tag_trello_id;
  @Column private String tag_name;
  @Column private Integer card_id;
  @Column private String tag_type;
}
