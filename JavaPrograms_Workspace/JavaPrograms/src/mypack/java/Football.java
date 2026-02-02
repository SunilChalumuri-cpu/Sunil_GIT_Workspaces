package mypack.java;

public class Football extends Game {

	public Football() {
		System.out.println("Creating Football class that implements Game Template");
	}

	@Override
	void setupGame() {
		System.out.println("Search for the Football ground with air in the football");
	}

	@Override
	void startPlay() {
		System.out.println("Start playing");
	}

	@Override
	void endPlay() {
		System.out.println("End of Play");
	}
}
