package org.trelloBoard.model.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class OrganizationEntity {

  @Id private String organization_trello_id;
  @Column private String organization_name;
}
