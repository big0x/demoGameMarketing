package demoGameMarketing.dataAccess.concretes.hibernateimpls;

import demoGameMarketing.dataAccess.abstracts.GameDao;
import demoGameMarketing.entities.concretes.Game;

public class GameHibernateDao implements GameDao {

	@Override
	public void add(Game game) {
		System.out.println(game.getGameName() + " Game added to Hibernate");
	}

	@Override
	public void delete(Game game) {
		System.out.println(game.getGameName() + " Game deleted from Hibernate");
	}

	@Override
	public void update(Game game) {
		System.out.println(game.getGameName() + " Game updated at Hibernate");
	}

}
