package demoGameMarketing.dataAccess.abstracts;

import demoGameMarketing.entities.concretes.Promotion;

public interface PromotionDao {
	void add(Promotion promotion);

	void delete(Promotion promotion);

	void update(Promotion promotion);

}
