package Exercise1;

/**
 * This class represents main
 * @author User
 *
 */

public class ThreadTask extends Thread {

	
	
	public void printNumbers(String currentThread) {
		java.util.Date date=new java.util.Date();  
		
		System.out.print("Thread Task represents a total of 10 iterations from both Threads\n");
		System.out.print("5 From Each Thread\n");
		for (int counter=0; counter<5; counter++) {

		System.out.print(currentThread+" Thread No:"+counter+" -> "+date+"\n");
	}
	}
	@Override
	public void run() {
		//Get Current Thread
		Thread currentThread=Thread.currentThread();
		
		// Execute Tasks
		printNumbers(currentThread.getName());
		// TODO Auto-generated method stub

	}

}
