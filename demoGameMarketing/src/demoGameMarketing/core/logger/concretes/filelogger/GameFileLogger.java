package demoGameMarketing.core.logger.concretes.filelogger;

import demoGameMarketing.core.logger.abstracts.GameLogger;
import demoGameMarketing.entities.concretes.Game;

public class GameFileLogger implements GameLogger {

	@Override
	public void add(Game game) {
		System.out.println(game.getGameName() + " logged to File");
	}

	@Override
	public void delete(Game game) {
		System.out.println(game.getGameName() + " log deleted from File");
	}

	@Override
	public void update(Game game) {
		System.out.println(game.getGameName() + " log updated at File");

	}

}
