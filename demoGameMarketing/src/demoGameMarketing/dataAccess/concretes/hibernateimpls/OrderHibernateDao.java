package demoGameMarketing.dataAccess.concretes.hibernateimpls;

import demoGameMarketing.dataAccess.abstracts.OrderDao;
import demoGameMarketing.entities.concretes.Order;

public class OrderHibernateDao implements OrderDao{

	@Override
	public void add(Order order) {
		System.out.println(order.getId() + " Order added to Hibernate");
		
	}

	@Override
	public void delete(Order order) {
		System.out.println(order.getId() + " Order deleted from Hibernate");
		
	}

	@Override
	public void update(Order order) {
		System.out.println(order.getId() + " Order updated at Hibernate");
		
	}

}
