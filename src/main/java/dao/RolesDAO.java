package dao;

import org.hibernate.Session;

import mvc.model.Roles;
import util.HibernateUtil;

public class RolesDAO {
	
	public static void insertRoles(Session s, Roles roles) {
		s.save(roles);
		
	}

}
