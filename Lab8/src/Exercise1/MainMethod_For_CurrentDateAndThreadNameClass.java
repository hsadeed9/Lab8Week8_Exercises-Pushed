package Exercise1;

/**
 * This Class 
 * @author User
 *
 */
public class MainMethod_For_CurrentDateAndThreadNameClass {
	
	public static void main(String[] args) {
	
	Thread statementThread_object1=new ThreadTask();
	Thread statementThread_object2=new ThreadTask();
	statementThread_object1.setName("Current Date from ThreadObject1");

	statementThread_object2.setName("Current Date from ThreadObject2");
	statementThread_object2.start();
	statementThread_object1.start();
	}
	

}
