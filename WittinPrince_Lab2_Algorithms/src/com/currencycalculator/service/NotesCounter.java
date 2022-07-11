package com.currencycalculator.service;

public class NotesCounter {

public void notesCount(int [] denominationsArray,int target) {
		
		
		int notesCounter [] = new int [denominationsArray.length];
			for (int i=0;i<denominationsArray.length;i++) {
				
				if (target>=denominationsArray[i]) {
					
					notesCounter[i]=target/denominationsArray[i];
					target= target - notesCounter[i] * denominationsArray[i];
					
				}
			}
			
			if (target>0) {
				System.out.println("The exact amount is not reachable");
			}
			else {
				System.out.println("The amount to be paid in denominations are:");
				for(int index=0;index<notesCounter.length;index++) {
					
				System.out.println(denominationsArray[index]+":"+notesCounter[index]);
					
			}
			
			
		
		
	}
	
	
}


}
	

