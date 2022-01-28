package demoGameMarketing.business.concretes;

import java.util.ArrayList;

import demoGameMarketing.business.abstracts.GameService;
import demoGameMarketing.entities.concretes.Game;

public class GameManager implements GameService {

	ArrayList<Game> games = new ArrayList<Game>();

	@Override
	public void add(Game addedGame) {
		for (Game game : games) {
			if (game.getId() == addedGame.getId()) {
				System.out.println("Game already exist.");
				return;

			}
			this.games.add(addedGame);
			System.out.println("Game " + addedGame.getGameName() + "added to library");

		}
	}

	@Override
	public void delete(int id) {
		Game deletedGame = new Game();
		for (Game game : games) {
			if (game.getId() == id) {
				deletedGame = game;
			}
		}
		System.out.println("Game : " + deletedGame.getGameName() + " is deleted.");
		games.remove(deletedGame);

	}

	@Override
	public void update(Game updatedGame) {
		for (Game game : games) {
			if (game.getId() == updatedGame.getId()) {
				games.set(games.indexOf(game), updatedGame);
				System.out.println("Game with " + game.getId() + " id number is updated.");
				return;
			}
		}
		System.out.println("Game can not found.");
	}

}
