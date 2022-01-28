package demoGameMarketing.core.logger.concretes.dblogger;

import demoGameMarketing.core.logger.abstracts.PromotionLogger;
import demoGameMarketing.entities.concretes.Promotion;

public class PromotionDbLogger implements PromotionLogger {

	@Override
	public void add(Promotion promotion) {
		System.out.println(promotion.getPromotionName() + " promotion logged to Database");
	}

	@Override
	public void delete(Promotion promotion) {
		System.out.println(promotion.getPromotionName() + " promotion log deleted from Database");
	}

	@Override
	public void update(Promotion promotion) {
		System.out.println(promotion.getPromotionName() + " promotion log updated at Database");
	}

}
