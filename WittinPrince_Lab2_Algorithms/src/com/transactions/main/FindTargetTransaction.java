package com.transactions.main;

import java.util.*;

public class FindTargetTransaction {

		private static final Scanner sc=new Scanner(System.in);
		
		public static void main(String[] args) {
			
			
			System.out.println("Enter number of transactions per day");
			int size=sc.nextInt();
			
			int [] transactionArray = new int [size];
			System.out.println("Enter the transactions:");
			for (int index=0;index<size;) {
				int transaction=sc.nextInt();
				if (transaction>0) {
					transactionArray[index]=transaction;
					index ++;
				}
				
			}
			
			System.out.println("Enter number of target ");
			int noOfTarget=sc.nextInt();
			getNumberOfTransactions(transactionArray,noOfTarget);
			
		}
			
			private static void getNumberOfTransactions(int [] transactionsArray,int noOfTarget) {
				while(noOfTarget>0) {
				System.out.println("Enter target:");
				int target=sc.nextInt();
				int transactionCount=transactionCount(transactionsArray,target);
				
				if(transactionCount!=-1) {
				System.out.println("The number of transactions at which the target is acheived is ="+transactionCount);
				
				}
				else {	
					System.out.println("The target is not acheived");
				}
				
				noOfTarget--;
				
			}
				
			}
				
			private static int transactionCount(int [] transactionsArray,int target) {
				int transactionCount=0;
				int sum=0;
				 do{
					sum=sum+transactionsArray[transactionCount];
					transactionCount++;
				}while(sum<target && transactionCount < transactionsArray.length);	 
				 
				 if(transactionCount >=transactionsArray.length) {
					 return -1;
				 }else {
					 return transactionCount;
				 }
			}
				
	}	
	



