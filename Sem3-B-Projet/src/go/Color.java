package go;

public enum Color {
	BLACK, WHITE;

	private int score;
	private Coord lastTake;
	private boolean skip = false;

	public int getScore() {
		return score;
	}

	char getSymbol() {
		return switch (this) {
		case BLACK -> 'X';
		case WHITE -> 'O';
		};
	}

	public Color otherColor() {
		return switch (this) {
		case BLACK -> WHITE;
		case WHITE -> BLACK;
		};
	}

	public void addToScore(int points) {
		score += points;
	}

	public void skip() {
		skip = true;
	}

	public void havePlay() {
		skip = false;
	}

	public boolean haveSkip() {
		return skip;
	}

	public void play(Coord c) {
		lastTake = c;
	}

	public Coord getLT() {
		return lastTake;
	}
}
