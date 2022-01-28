package demoGameMarketing.dataAccess.concretes.jdbcimpls;

import demoGameMarketing.dataAccess.abstracts.UserDao;
import demoGameMarketing.entities.concretes.User;

public class UserJdbcDao implements UserDao{

	@Override
	public void add(User user) {
		System.out.println(user.getUsername() + " User added to Jdbc");		
	}

	@Override
	public void delete(User user) {
		System.out.println(user.getUsername() + " User deleted from Jdbc");
		
	}

	@Override
	public void update(User user) {
		System.out.println(user.getUsername() + " User updated at Jdbc");
		
	}

}
