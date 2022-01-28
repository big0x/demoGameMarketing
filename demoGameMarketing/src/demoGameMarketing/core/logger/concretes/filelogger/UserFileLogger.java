package demoGameMarketing.core.logger.concretes.filelogger;

import demoGameMarketing.core.logger.abstracts.UserLogger;
import demoGameMarketing.entities.concretes.User;

public class UserFileLogger implements UserLogger {

	@Override
	public void add(User user) {
		System.out.println(user.getUsername() + " user logged to File");
	}

	@Override
	public void delete(User user) {
		System.out.println(user.getUsername() + " user log deleted from File");
	}

	@Override
	public void update(User user) {
		System.out.println(user.getUsername() + " user log updated at File");
	}

}
