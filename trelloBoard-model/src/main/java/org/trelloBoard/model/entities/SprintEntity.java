package org.trelloBoard.model.entities;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;

@Entity
@Data
@Table(schema = "\"public\"", name = "\"trelloBoard_sprint\"")
public class SprintEntity {

  @Id private Integer id;

  @Column(name = "sprint_number")
  private Integer sprintNumber;

  @Column(name = "start_date")
  private LocalDate startDate;

  @Column(name = "end_date")
  @JsonFormat(pattern = "yyyy-MM-dd")
  private LocalDate endDate;

  @Column(name = "number_of_tasks")
  private Integer numberOfTasks;
}
