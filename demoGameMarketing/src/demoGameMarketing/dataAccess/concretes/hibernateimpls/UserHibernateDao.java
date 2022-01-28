package demoGameMarketing.dataAccess.concretes.hibernateimpls;

import demoGameMarketing.dataAccess.abstracts.UserDao;
import demoGameMarketing.entities.concretes.User;

public class UserHibernateDao implements UserDao{

	@Override
	public void add(User user) {
		System.out.println(user.getUsername() + " User added to Hibernate");		
	}

	@Override
	public void delete(User user) {
		System.out.println(user.getUsername() + " User deleted from Hibernate");		
	}

	@Override
	public void update(User user) {
		System.out.println(user.getUsername() + " User updated at Hibernate");		
	}

}
