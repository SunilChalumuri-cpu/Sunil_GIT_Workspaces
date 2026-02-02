package mypack.java;

/**
 * Created by 611005937 on 12/6/2017.
 */
public class AnonymousRunable {
	public static void main(String args[]) {
		Runnable myRunnable = new Runnable() {
			@Override
			public void run() {
				try {
					for (int i = 5; i > 0; i--) {
						System.out.println(" Child thread: " + i);
						// Thread.sleep(500);
					}
				} catch (Exception e) {
					System.out.println(" Child interrupted ");
				}
				System.out.println(" Exiting child thread ");
			}
		};

		Thread t = new Thread(myRunnable);
		t.start();
	}
}
