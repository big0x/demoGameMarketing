package demoGameMarketing.business.concretes;

import demoGameMarketing.business.abstracts.UserService;
import demoGameMarketing.core.adapters.absracts.UserCheckService;
import demoGameMarketing.entities.concretes.User;

public class UserManager implements UserService{

	private UserCheckService userCheckService;
	public UserManager(UserCheckService userCheckService) {
		super();
		this.userCheckService=userCheckService;
		
	}

	@Override
	public void add(User user) {
		if (userCheckService.checkIfRealPerson(user)==true) {
			System.out.println("User registered.");
		}else {
			System.out.println("User cannot registered.");
		}
	}

	@Override
	public void delete(User user) {
		System.out.println("User deleted.");
	}

	@Override
	public void update(User user) {
		System.out.println("User updated.");
		
	}

}
