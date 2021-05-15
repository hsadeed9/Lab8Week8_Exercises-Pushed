package Exercise2AndExercise3;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class main {

	
	public static void main(String[] args) {
		
		
Runnable runnableObjecttext1=new TrackingMultipleThreads();

Runnable runnableObject2=new TrackingMultipleThreads();

Thread word1= new Thread(runnableObjecttext1);
Thread word2= new Thread(runnableObjecttext1);
word1.setName("Word1");
word2.setName("Word2");
TrackingMultipleThreads text=new TrackingMultipleThreads();
//Create a fixed Thread Pool with Maximum three Threads

		ExecutorService printExecutorService =Executors.newFixedThreadPool(1);
		
		//Submit to Executor
		
		
		try {
			printExecutorService.execute(text.MethodToExtractTextPortion());//Calling Object1
	
		printExecutorService.shutdown();
		
		}
		catch(NullPointerException ex) {
			//Nullpointer ExceptionThrowed But Ignored
		}
		
		
		System.out.println("Display Data in Any Random Order-Exercise 2:\n");
	word1.start();//Running Object 2
    word2.start();//Running Object 3 
   
		try {
			word1.join();
			word2.join();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		


	}
	
}
