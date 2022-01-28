package demoGameMarketing.core.logger.abstracts;

import demoGameMarketing.entities.concretes.Game;

public interface GameLogger {
	void add(Game game);

	void delete(Game game);

	void update(Game game);

}
