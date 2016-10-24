package org.cuatrovientos.hybernate.manyToMany.models;

import java.util.HashSet;
import java.util.Set;

public class User {
	private Long id;
	private String login;
	private String password;
	private String email;
	private Set<Role> roles= new HashSet<Role>();
	
	/**
	 * @param email
	 * @param id
	 * @param login
	 * @param password
	 * @param roles
	 */
	public User(Long id, String email, String login, String password) {
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
	public Set<Role> getRoles() {
		return roles;
	}
	public void setRoles(Set<Role> roles) {
		this.roles = roles;
	}
	
	
}
