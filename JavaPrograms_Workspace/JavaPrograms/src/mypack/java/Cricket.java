package mypack.java;

public class Cricket extends Game {

	public Cricket() {
		System.out.println("Creating Cricket class that implements Game Template");
	}

	@Override
	void setupGame() {
		System.out.println("Make the Cricket pitch ready with stumps placed");
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
