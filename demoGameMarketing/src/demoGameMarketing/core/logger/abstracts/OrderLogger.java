package demoGameMarketing.core.logger.abstracts;

import demoGameMarketing.entities.concretes.Order;

public interface OrderLogger {
	void add(Order order);

	void delete(Order order);

	void update(Order order);

}
