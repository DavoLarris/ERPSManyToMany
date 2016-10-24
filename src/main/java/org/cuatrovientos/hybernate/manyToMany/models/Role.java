package org.cuatrovientos.hybernate.manyToMany.models;

import java.util.HashSet;
import java.util.Set;

public class Role {
	private Long roleId;
	private String name;
	private String description;
	//Bidireccional
	 private Set<User> users = new HashSet<User>();
	
	/**
	 * @param description
	 * @param id
	 * @param name
	 */
	public Role(Long idRole, String description, String name) {
		this.description = description;
		this.roleId = idRole;
		this.name = name;
	}
	/**
	 * 
	 */
	public Role() {
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Long getroleId() {
		return roleId;
	}
	public void setroleId(Long idRole) {
		this.roleId = idRole;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	//Bidireccional
	
	public Set<User> getUsers() {
		return users;
	}

	public void setUsers(Set<User> users) {
		this.users = users;
	}
}
