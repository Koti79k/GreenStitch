package com.spring.model;

import java.io.Serializable;

import javax.persistence.Column;

import lombok.Data;

@Data
public class JwtRequest implements Serializable {

	private static final long serialVersionUID = 5926468583005150707L;
	
	private String username;
	
	@Column(length = 300)
	private String password;
	
}