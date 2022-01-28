package demoGameMarketing.core.logger.concretes.dblogger;

import demoGameMarketing.core.logger.abstracts.GameLogger;
import demoGameMarketing.entities.concretes.Game;

public class GameDbLogger implements GameLogger{

	@Override
	public void add(Game game) {
System.out.println(game.getGameName() + " logged to Database");		
	}

	@Override
	public void delete(Game game) {
		System.out.println(game.getGameName() + " log deleted from Database");		
	}

	@Override
	public void update(Game game) {
		System.out.println(game.getGameName() + " log updated at Database");		
	}

}
