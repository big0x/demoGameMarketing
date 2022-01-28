package demoGameMarketing.business.abstracts;

import demoGameMarketing.entities.concretes.Game;
import demoGameMarketing.entities.concretes.Order;
import demoGameMarketing.entities.concretes.Promotion;
import demoGameMarketing.entities.concretes.User;

public interface OrderService {
	void add(Order order);

	void delete(Order order);

	void sale(User user,Game game,Promotion promotion);
	
}
