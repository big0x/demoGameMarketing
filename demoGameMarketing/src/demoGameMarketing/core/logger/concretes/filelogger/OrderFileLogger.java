package demoGameMarketing.core.logger.concretes.filelogger;

import demoGameMarketing.core.logger.abstracts.OrderLogger;
import demoGameMarketing.entities.concretes.Order;

public class OrderFileLogger implements OrderLogger {

	@Override
	public void add(Order order) {
		System.out.println(order.getId() + " numbered order logged to File");
	}

	@Override
	public void delete(Order order) {
		System.out.println(order.getId() + " numbered order log deleted from File");
	}

	@Override
	public void update(Order order) {
		System.out.println(order.getId() + " numbered order log updated at File");
	}

}
