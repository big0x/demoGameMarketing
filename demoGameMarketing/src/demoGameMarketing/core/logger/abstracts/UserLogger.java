package demoGameMarketing.core.logger.abstracts;

import demoGameMarketing.entities.concretes.User;

public interface UserLogger {
	void add(User user);

	void delete(User user);

	void update(User user);
}
