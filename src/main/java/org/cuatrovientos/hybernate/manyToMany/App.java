package org.cuatrovientos.hybernate.manyToMany;

import java.util.HashSet;
import java.util.List;

import org.cuatrovientos.hybernate.dao.impl.RoleDAO;
import org.cuatrovientos.hybernate.dao.impl.UserDAO;
import org.cuatrovientos.hybernate.manyToMany.dao.RoleDAOInterface;
import org.cuatrovientos.hybernate.manyToMany.dao.UserDAOInterface;
import org.cuatrovientos.hybernate.manyToMany.models.Role;
import org.cuatrovientos.hybernate.manyToMany.models.User;

/**
 * Hello world!
 *
 */
public class App 
{
	/**
	 * simple function for reusing
	 * @param userDAOInterface
	 */
	public static void showAllUsers (UserDAOInterface userDAOInterface) {
		// SELECT ALL DATA
    	List<User> users = userDAOInterface.selectAll();
    	String userDesc = "";
        
    	System.out.println("\n--- Users ----- table contents -----------");
        
        for(User user : users) {
        	userDesc = "Id: " + user.getId() + 
        					" - Name: " + user.getLogin() + 
        					" - Roles: " + user.getRoles().toString();
        	System.out.println(userDesc);
        }

        System.out.println("Total users: " + users.size());	
	}
	
	/**
	 * simple function for reusing
	 * @param userDAOInterface
	 */
	public static void showAllRoles (RoleDAOInterface roleDAOInterface) {
		// SELECT ALL DATA
    	List<Role> roles = roleDAOInterface.selectAll();
    	String roleDesc = "";
        
    	System.out.println("\n--- Roles ----- table contents -----------");
        
        for(Role role : roles) {
        	roleDesc = "Id: " + role.getId() + 
        					" - Name: " + role.getName() +
        					" - Description: " + role.getDescription();
        	System.out.println(roleDesc);
        }

        System.out.println("Total roles: " + roles.size());	
	}
	
	
	/**
	 * main function
	 * @param args
	 */
    public static void main( String[] args )
    {

    	UserDAOInterface userDAO = new UserDAO();
    	RoleDAOInterface roleDAO = new RoleDAO();

    	
        // INSERT NEW DATA
    	Role role = new Role(0l,"default","Another role");
    	roleDAO.insert(role);
    	HashSet<Role> roles = new HashSet<Role>();
    	roles.add(role);
    	
    	User newUser = new User(0l,"newuser","1234567","newuser@gmail.com");
    	newUser.setRoles(roles);
    	
    	userDAO.insert(newUser);
    	
    	System.out.println("Inserted id: " + newUser.getId());
    	
        System.out.println("\nShow data after new insert");
    	showAllUsers(userDAO);
    	showAllRoles(roleDAO);    	
    	
        // SELECT JUST ONE
        User oneUser = userDAO.selectById(1l);
    	System.out.println("Selected Name: " + oneUser.getLogin());
    	
        
        // UPDATE DATA
        newUser.setLogin("changed");
        userDAO.update(newUser);

        System.out.println("\nShow data after update");
    	showAllUsers(userDAO);
        
        // DELETE DATA
        userDAO.delete(newUser);
        System.out.println("\nShow data after deletion");
    	showAllUsers(userDAO);

    }
}

