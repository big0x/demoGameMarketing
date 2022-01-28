package demoGameMarketing.core.logger.concretes.dblogger;

import demoGameMarketing.core.logger.abstracts.OrderLogger;
import demoGameMarketing.entities.concretes.Order;

public class OrderDbLogger implements OrderLogger {

	@Override
	public void add(Order order) {
		System.out.println(order.getId() + " numbered order logged to Database");
	}

	@Override
	public void delete(Order order) {
		System.out.println(order.getId() + " numbered order log deleted from Database");
	}

	@Override
	public void update(Order order) {
		System.out.println(order.getId() + " numbered order log updated at Database");
	}

}
