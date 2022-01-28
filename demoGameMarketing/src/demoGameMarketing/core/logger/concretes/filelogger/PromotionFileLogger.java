package demoGameMarketing.core.logger.concretes.filelogger;

import demoGameMarketing.core.logger.abstracts.PromotionLogger;
import demoGameMarketing.entities.concretes.Promotion;

public class PromotionFileLogger implements PromotionLogger {

	@Override
	public void add(Promotion promotion) {
		System.out.println(promotion.getPromotionName() + " promotion logged to File");
	}

	@Override
	public void delete(Promotion promotion) {
		System.out.println(promotion.getPromotionName() + " promotion log deleted from File");
	}

	@Override
	public void update(Promotion promotion) {
		System.out.println(promotion.getPromotionName() + " promotion log updated at File");
	}

}
