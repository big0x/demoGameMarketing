package demoGameMarketing.dataAccess.concretes.hibernateimpls;

import demoGameMarketing.dataAccess.abstracts.PromotionDao;
import demoGameMarketing.entities.concretes.Promotion;

public class PromotionHibernateDao implements PromotionDao{

	@Override
	public void add(Promotion promotion) {
		System.out.println(promotion.getPromotionName() + " Promotion added to Hibernate");		
	}

	@Override
	public void delete(Promotion promotion) {
		System.out.println(promotion.getPromotionName() + " Promotion deleted from Hibernate");		
	}

	@Override
	public void update(Promotion promotion) {
		System.out.println(promotion.getPromotionName() + " Promotion updated at Hibernate");		
	}

}
