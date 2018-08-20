package org.itstep.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table( name = "USERS")
public class User {
	
	@Id
	@Column(name = "LOGIN")
	@JsonProperty
	private String login;
	
	@Column(name = "PASSWORD")
	@JsonProperty
	private String password;
	
	@Column(name = "FIRSTNAME")
	@JsonProperty
	private String firstName;
	
	@Column(name = "SECONDNAME")
	@JsonProperty
	private String secondName;
	
	@Column(name = "PASSWORD")
	@JsonProperty
	private String password;
}
