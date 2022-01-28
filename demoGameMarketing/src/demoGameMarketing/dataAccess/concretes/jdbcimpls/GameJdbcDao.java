package demoGameMarketing.dataAccess.concretes.jdbcimpls;

import demoGameMarketing.dataAccess.abstracts.GameDao;
import demoGameMarketing.entities.concretes.Game;

public class GameJdbcDao implements GameDao{

	@Override
	public void add(Game game) {
		System.out.println(game.getGameName() + " Game added to Jdbc");		
	}

	@Override
	public void delete(Game game) {
		System.out.println(game.getGameName() + " Game deleted from Jdbc");	
	}

	@Override
	public void update(Game game) {
		System.out.println(game.getGameName() + " Game updated at Jdbc");		
	}

}
