package demoGameMarketing.business.concretes;

import java.util.ArrayList;

import demoGameMarketing.business.abstracts.PromotionService;
import demoGameMarketing.entities.concretes.Promotion;

public class PromotionManager implements PromotionService {
	ArrayList<Promotion> promotions = new ArrayList<Promotion>();
	@Override
	public void add(Promotion promotion) {
		this.add(promotion);
		System.out.println(promotion.getPromotionName()+ " promotion added.");
	}

	@Override
	public void delete(Promotion promotion) {
		this.delete(promotion);
		System.out.println(promotion.getPromotionName()+ " promotion deleted.");
		
	}

	@Override
	public void update(Promotion updatedPromotion) {
		for (Promotion promotion : promotions) {
			if (promotion.getId() == updatedPromotion.getId()) {
				promotions.set(promotions.indexOf(promotion), updatedPromotion);
				System.out.println("Promotion wih " + promotion.getId() + " id number is updated.");
				return;
	}
		}
}
}