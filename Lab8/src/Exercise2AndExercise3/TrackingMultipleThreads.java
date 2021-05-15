package Exercise2AndExercise3;

public class TrackingMultipleThreads implements Runnable {
	String[] strArray =new String[7];
	
		
	public Runnable MethodToExtractTextPortion()
	
	{
		
	
	try {
		
		strArray[0]= "It";
		strArray[1]= "is";
		strArray[2]= "recommended";
		strArray[3]= "to";
		strArray[4]= "use";
		strArray[5]= "Calendar";
		strArray[6]= "Class";
		System.out.println("\nThe following are the 10 repetitions:\n");
	
		for(int counter=0; counter<10;counter++) {
			//Extracts only one text at first repitation
			if(counter==7) {
				System.out.print("\nTextPortion -"+7+"->");
				
			}
			else if (counter==8) {
				System.out.print("\nTextPortion -"+8+"->");
				
			}
			
			else if (counter==9) {
				System.out.print("\nTextPortion -"+9+"->");
				
			}
			else {
			System.out.print("\nTextPortion -"+counter+"->");
			System.out.print(strArray[counter]);
			}
			
			if(counter==1) {// Extractions 2 texts at Second Repetion
				System.out.print(" ");	
				System.out.print(strArray[2]);
				System.out.print("\t(Extracted 2 words-\t\t	Extraction Increased) ");
				Thread.sleep(1000);
			}
			
			
			if(counter==2) {// Extractions 3 texts at Second Repetion
				System.out.print(" ");	
				System.out.print(strArray[3]);
				System.out.print(" ");
				System.out.print(strArray[4]);
				System.out.print("\t(Extracted 3 words-\t\t	Extraction Increased) ");
				Thread.sleep(1000);
			}
			

			if(counter==3) {// Extractions 4 texts at Second Repetion
				System.out.print(" ");	
				System.out.print(strArray[4]);
				System.out.print(" ");
				System.out.print(strArray[5]);
				System.out.print(" ");
				System.out.print(strArray[6]);
				System.out.print("\t(Extracted 4 words-\t\t	Extraction Increased) ");
				Thread.sleep(1000);
			}
			
			if(counter==4) {// Extractions 5 texts at Second Repetion
				System.out.print(" ");	
				System.out.print(strArray[5]);
				System.out.print(" ");
				System.out.print(strArray[6]);
				System.out.print(" ");
				System.out.print(strArray[0]);
				System.out.print(" ");
				System.out.print(strArray[1]);
				System.out.print("\t(Extracted 5 words-\t\t	Extraction Increased) ");
				Thread.sleep(1000);
			}
			
			if(counter==5) {// Extractions 6 texts at Second Repetion
				System.out.print(" ");	
				System.out.print(strArray[6]);
				System.out.print(" ");
				System.out.print(strArray[0]);
				System.out.print(" ");
				System.out.print(strArray[1]);
				System.out.print(" ");
				System.out.print(strArray[2]);
				System.out.print(" ");
				System.out.print(strArray[3]);
				System.out.print("\t(Extracted 6 words-\t\t	Extraction Increased) ");
				Thread.sleep(1000);
			}
			
			if(counter==6) {// Extractions 7 texts at Second Repetion
				System.out.print(" ");	
				System.out.print(strArray[0]);
				System.out.print(" ");
				System.out.print(strArray[1]);
				System.out.print(" ");
				System.out.print(strArray[2]);
				System.out.print(" ");
				System.out.print(strArray[3]);
				System.out.print(" ");
				System.out.print(strArray[4]);
				
				System.out.print(" ");
				System.out.print(strArray[5]);
				System.out.print("\t(Extracted 7 words-\t\t	Extraction Increased) ");
				Thread.sleep(1000);
			}
			
			
			if(counter==7) {// Extractions 8 texts at Second Repetion
				System.out.print(" ");	
				System.out.print(strArray[0]);
				System.out.print(" ");
				System.out.print(strArray[1]);
				System.out.print(" ");
				System.out.print(strArray[2]);
				System.out.print(" ");
				System.out.print(strArray[3]);
				System.out.print(" ");
				System.out.print(strArray[4]);
				
				
				System.out.print(" ");
				System.out.print(strArray[5]);
				System.out.print(" ");
				System.out.print(strArray[6]);
			    System.out.print(" ");
				System.out.print(strArray[0]);
				System.out.print("\t(Extracted 8 words-\t\t	Extraction Increased) ");
				Thread.sleep(1000);
			}
			
			
			if(counter==8) {// Extractions 9 texts at Second Repetion
				System.out.print(" ");	
				System.out.print(strArray[0]);
				System.out.print(" ");
				System.out.print(strArray[1]);
				System.out.print(" ");
				System.out.print(strArray[2]);
				System.out.print(" ");
				System.out.print(strArray[3]);
				System.out.print(" ");
				System.out.print(strArray[4]);
			System.out.print(" ");
				System.out.print(strArray[5]);
				System.out.print(" ");
				System.out.print(strArray[6]);
				System.out.print(" ");
				System.out.print(strArray[0]);
				System.out.print(" ");
				System.out.print(strArray[1]);
				System.out.print("\t(Extracted 9 words-\t\t	Extraction Increased) ");
				Thread.sleep(1000);
			}
			
			
			if(counter==9) {// Extractions 9 texts at Second Repetion
				System.out.print(" ");	
				System.out.print(strArray[0]);
				System.out.print(" ");
				System.out.print(strArray[1]);
				System.out.print(" ");
				System.out.print(strArray[2]);
				System.out.print(" ");
				System.out.print(strArray[3]);
				System.out.print(" ");
				System.out.print(strArray[4]);
			System.out.print(" ");
				System.out.print(strArray[5]);
				System.out.print(" ");
				System.out.print(strArray[6]);
				System.out.print(" ");
				System.out.print(strArray[0]);
				System.out.print(" ");
				System.out.print(strArray[1]);
				System.out.print(" ");
				System.out.print(strArray[2]);
				System.out.print("\t(Extracted 10 words-\t\t	Extraction Increased) ");
				Thread.sleep(1000);
				System.out.println("\n\n\n\n");
			}
			}
		
	}catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
return null;
		}
		
		
	
	
	
	public void DisplayDataInRandomOrder() {

		for(int counter=0; counter<7;counter++) {
			
			strArray[0]= "It";
			strArray[1]= "is";
			strArray[2]= "recommended";
			strArray[3]= "to";
			strArray[4]= "use";
			strArray[5]= "Calendar";
			strArray[6]= "Class";
			System.out.print(strArray[counter]+" ");
		}
		
		
		
	}
		

		@Override
		public void run() {
			// TODO Auto-generated method stub
			
		Thread currentThread=Thread.currentThread();
		
			DisplayDataInRandomOrder();
			 
			DisplayDataInRandomOrder(currentThread.getName());//OverLoaded function
		
		}





		private void DisplayDataInRandomOrder(String CurrentThreadName) {
			
		
			
			for(int counter=0; counter<7;counter++) {
				
				strArray[0]= "It";
				strArray[1]= "is";
				strArray[2]= "recommended";
				strArray[3]= "to";
				strArray[4]= "use";
				strArray[5]= "Calendar";
				strArray[6]= "Class";
				System.out.print("\n\n"+strArray[counter]+"->Call from Thread Name:"+CurrentThreadName+"\t->Overloaded funct_Sleep for 5 Seconds-Exercise 3\n");
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			
		}
		
}	
		
		



