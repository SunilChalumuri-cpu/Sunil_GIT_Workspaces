package mypack.java;

public abstract class Game {
	abstract void setupGame();

	abstract void startPlay();

	abstract void endPlay();

	// Template method
	public final void play() {
		setupGame();
		startPlay();
		endPlay();
	}

}
