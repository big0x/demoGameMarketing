package demoGameMarketing.dataAccess.concretes.jdbcimpls;

import demoGameMarketing.dataAccess.abstracts.PromotionDao;
import demoGameMarketing.entities.concretes.Promotion;

public class PromotionJdbcDao implements PromotionDao{

	@Override
	public void add(Promotion promotion) {
		System.out.println(promotion.getPromotionName() + " Promotion added to Jdbc");		
	}

	@Override
	public void delete(Promotion promotion) {
		System.out.println(promotion.getPromotionName() + " Promotion deleted from Jdbc");		
	}

	@Override
	public void update(Promotion promotion) {
		System.out.println(promotion.getPromotionName() + " Promotion updated at Jdbc");		
	}

}
