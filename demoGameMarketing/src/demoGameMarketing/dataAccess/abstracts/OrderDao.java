package demoGameMarketing.dataAccess.abstracts;

import demoGameMarketing.entities.concretes.Order;

public interface OrderDao {
	void add(Order order);

	void delete(Order order);

	void update(Order order);

}
