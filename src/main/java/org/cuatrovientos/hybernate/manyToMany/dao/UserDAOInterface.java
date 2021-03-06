package org.cuatrovientos.hybernate.manyToMany.dao;

import java.util.List;

import org.cuatrovientos.hybernate.manyToMany.models.User;

public interface UserDAOInterface {
	public User selectById(Long id);
	public List<User> selectAll ();
	public void insert (User user);
	public void update (User user);
	public void delete (User user);

}
