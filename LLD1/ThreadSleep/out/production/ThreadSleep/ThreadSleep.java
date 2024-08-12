// Java Program for sleeping the custom thread.

import java.io.*;
import java.lang.Thread;

class ThreadSleep extends Thread {

	public void run()
	{
		// thread 0

		// we can also use throws keyword followed by
		// exception name for throwing the exception
		try {
			for (int i = 0; i < 5; i++) {

				// it will sleep the main thread for 1 sec
				// ,each time the for loop runs
				System.out.println("\nbefore going to sleep");
				Thread.sleep(1000);
				System.out.println("After going to sleep");
				// This Thread.sleep() method will sleep the
				// thread 0.
				// printing the value of the variable
				System.out.println(i);
			}
		}
		catch (Exception e) {

			// catching the exception
			System.out.println(e);
		}
	}
	public static void main(String[] args)
	{
		// main thread
        ThreadSleep obj = new ThreadSleep();
		obj.start();
	}
}
