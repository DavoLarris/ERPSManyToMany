package org.cuatrovientos.hybernate.manyToMany.models;

public class Role {
	private String description;
	private Long id;
	private String name;
	//Bidireccional
	// private Set<User> users;
	
	/**
	 * @param description
	 * @param id
	 * @param name
	 */
	public Role(Long id, String description, String name) {
		this.description = description;
		this.id = id;
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
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	//Bidireccional
	
	//public Set<User> getUsers() {
	//	return users;
	//}

	//public void setUsers(Set<User> users) {
	//	this.users = users;
	//}
}
