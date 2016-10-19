package org.cuatrovientos.hybernate.manyToMany.models;

import java.util.HashSet;

public class User {
	private String email;
	private Long id;
	private String login;
	private String password;
	private HashSet<Role> roles;
	
	/**
	 * @param email
	 * @param id
	 * @param login
	 * @param password
	 * @param roles
	 */
	public User(String email, Long id, String login, String password, HashSet<Role> roles) {
		this.email = email;
		this.id = id;
		this.login = login;
		this.password = password;
		this.roles = roles;
	}
	
	/**
	 * 
	 */
	public User() {
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public HashSet<Role> getRoles() {
		return roles;
	}
	public void setRoles(HashSet<Role> roles) {
		this.roles = roles;
	}
	
	
}
