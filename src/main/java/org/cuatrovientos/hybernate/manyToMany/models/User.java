package org.cuatrovientos.hybernate.manyToMany.models;

import java.util.HashSet;
import java.util.Set;

public class User {
	private Long userId;
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
	public User(Long idUser, String email, String login, String password) {
		this.email = email;
		this.userId = idUser;
		this.login = login;
		this.password = password;
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
	public Long getuserId() {
		return userId;
	}
	public void setuserId(Long idUser) {
		this.userId = idUser;
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
