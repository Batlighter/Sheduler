package org.itstep.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table( name = "TASKS" )
public class Task {
	
	@Id
	@Column(name = "TASK_ID")
	@GeneratedValue( strategy = GenerationType.AUTO)
	@JsonProperty
	private Integer id;
	
	@Column(name = "TASK_DAY")
	@JsonProperty
	private Date day;
	
	@Column( name = "START_TIME")
	@JsonProperty
	private Long startTime;
	
	@Column( name = "END_TIME")
	@JsonProperty
	private Long endTime;
	
	@Column( name = "TASK_NAME")
	@JsonProperty
	private String name;	
	
	@ManyToOne( targetEntity = User.class )
	@JsonProperty
	private User user;
}