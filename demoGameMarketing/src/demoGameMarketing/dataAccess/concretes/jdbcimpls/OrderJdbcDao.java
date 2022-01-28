package demoGameMarketing.dataAccess.concretes.jdbcimpls;

import demoGameMarketing.dataAccess.abstracts.OrderDao;
import demoGameMarketing.entities.concretes.Order;

public class OrderJdbcDao implements OrderDao{

	@Override
	public void add(Order order) {
		System.out.println(order.getId() + " Order added to Jdbc");		
	}

	@Override
	public void delete(Order order) {
		System.out.println(order.getId() + " Order deleted from Jdbc");		
	}

	@Override
	public void update(Order order) {
		System.out.println(order.getId() + " Order updated at Jdbc");		
	}

}
