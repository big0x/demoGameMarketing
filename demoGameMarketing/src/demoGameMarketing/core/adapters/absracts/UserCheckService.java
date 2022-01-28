package demoGameMarketing.core.adapters.absracts;

import demoGameMarketing.entities.concretes.User;

public interface UserCheckService {
	boolean checkIfRealPerson(User user);
}
