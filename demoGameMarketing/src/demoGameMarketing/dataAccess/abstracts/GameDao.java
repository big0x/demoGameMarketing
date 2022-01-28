package demoGameMarketing.dataAccess.abstracts;

import demoGameMarketing.entities.concretes.Game;

public interface GameDao {
	void add(Game game);

	void delete(Game game);

	void update(Game game);
}
