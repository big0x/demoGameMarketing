package demoGameMarketing.core.logger.abstracts;

import demoGameMarketing.entities.concretes.Promotion;

public interface PromotionLogger {
	void add(Promotion promotion);

	void delete(Promotion promotion);

	void update(Promotion promotion);
}
