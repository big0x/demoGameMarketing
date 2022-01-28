package demoGameMarketing.business.abstracts;

import demoGameMarketing.entities.concretes.Promotion;

public interface PromotionService {

	void add(Promotion promotion);

	void delete(Promotion promotion);

	void update(Promotion promotion);

}
