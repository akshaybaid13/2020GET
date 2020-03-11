package com.metacube.training.model.commands;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class Signin {

	@NotBlank
	@Email(message = "{badEmail}")
	private String email;
	
	@NotBlank 
	@Size(min = 6, max =  20)
	private String password;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
}