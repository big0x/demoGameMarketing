package demoGameMarketing.business.abstracts;

import demoGameMarketing.entities.concretes.User;

public interface UserService {
	
	void add(User user);

	void delete(User user);

	void update(User user);

}
