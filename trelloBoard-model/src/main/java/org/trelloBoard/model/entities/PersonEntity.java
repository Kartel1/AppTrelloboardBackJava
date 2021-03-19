package org.trelloBoard.model.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class PersonEntity {

  @Id private Integer id;
  @Column private String usager;
  @Column private String user_infos;
  @Column private String user_logo;
  @Column private String slug;
  @Column private String organizations;
  @Column private String trello_id;
  @Column private boolean has_random_password;
}
