package org.trelloBoard.model;

import java.io.Serializable;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class Sprint implements Serializable {

  /** */
  private static final long serialVersionUID = -78927530586571583L;

  private Integer id;

  private Integer sprintNumber;

  private String startDate;

  private String endDate;

  private Integer numberOfTasks;
}
