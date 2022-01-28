package demoGameMarketing.business.abstracts;

import demoGameMarketing.entities.concretes.Game;

public interface GameService {

	void add(Game game);

	void delete(int id);

	void update(Game game);

}
