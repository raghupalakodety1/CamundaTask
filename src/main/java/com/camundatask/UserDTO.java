package com.camundatask;

public class UserDTO {
	private Long id;
	private String email;
	private String first_name;
	private String last_name;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	
	public UserDTO(Long id, String email, String first_name, String last_name) {
		this.id = id;
		this.email = email;
		this.first_name = first_name;
		this.last_name = last_name;
	}
	
	public UserDTO(User aUser) {
		this.id = aUser.getId();
		this.email = aUser.getEmail();
		this.first_name = aUser.getFirst_name();
		this.last_name = aUser.getLast_name();
	}
}
