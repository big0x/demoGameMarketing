package demoGameMarketing.business.concretes;

import demoGameMarketing.business.abstracts.OrderService;
import demoGameMarketing.entities.concretes.Game;
import demoGameMarketing.entities.concretes.Order;
import demoGameMarketing.entities.concretes.Promotion;
import demoGameMarketing.entities.concretes.User;

public class OrderManager implements OrderService{

	
	@Override
	public void add(Order order) {
		this.add(order);
		System.out.println("Order added.");
	}

	@Override
	public void delete(Order order) {
		this.delete(order);
		System.out.println("Order deleted.");
	}

	@Override
	public void sale(User user, Game game, Promotion promotion) {
		System.out.println(user.getUsername() + " bought " + game.getGameName() + "with promotion: " + promotion.getPromotionName());
		
	}


}
