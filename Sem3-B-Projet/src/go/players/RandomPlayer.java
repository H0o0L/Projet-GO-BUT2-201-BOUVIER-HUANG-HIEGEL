package go.players;

import java.util.Random;

import go.Coord;
import go.Goban;
import go.IPlayer;

public class RandomPlayer implements IPlayer {

	@Override
	public Coord getMove(Goban g) {
		/*
		 * if (g.toMove().otherColor().haveSkip() && g.toMove().getScore() >
		 * g.toMove().otherColor().getScore()) { return null; }
		 */
		Random r = new Random();
		int size = g.getBoardSize();
		int rx = r.nextInt(size);
		int ry = r.nextInt(size);
		int essaie = size * size;
		Coord lastTake = g.toMove().otherColor().getLT();
		System.out.println(lastTake);
		while (g.isOccupied(rx, ry) || (lastTake != null && lastTake.equals(new Coord(rx, ry)))
				|| (g.capture(rx, ry) <= 0 && g.isSuicide(rx, ry))) {
			if (rx + 1 / size == 1) {
				ry = (ry + 1) % size;
			}
			rx = (rx + 1) % size;
			essaie--;
			if (essaie == 0) {
				return null;
			}
		}
		return new Coord(rx, ry);
	}

	@Override
	public String getKind() {
		return "RandomPlayer";
	}

}
