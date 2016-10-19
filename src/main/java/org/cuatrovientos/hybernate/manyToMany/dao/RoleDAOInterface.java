package org.cuatrovientos.hybernate.manyToMany.dao;

import java.util.List;

import org.cuatrovientos.hybernate.manyToMany.models.Role;

public interface RoleDAOInterface {
	public Role selectById(Long id);
	public List<Role> selectAll ();
	public void insert (Role role);
	public void update (Role role);
	public void delete (Role role);

}
