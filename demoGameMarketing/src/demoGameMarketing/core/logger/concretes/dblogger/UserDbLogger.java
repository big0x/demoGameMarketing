package demoGameMarketing.core.logger.concretes.dblogger;

import demoGameMarketing.core.logger.abstracts.UserLogger;
import demoGameMarketing.entities.concretes.User;

public class UserDbLogger implements UserLogger {

	@Override
	public void add(User user) {
		System.out.println(user.getUsername() + " user logged to Database");
	}

	@Override
	public void delete(User user) {
		System.out.println(user.getUsername() + " user log deleted from Database");

	}

	@Override
	public void update(User user) {
		System.out.println(user.getUsername() + " user log updated at Database");

	}

}
