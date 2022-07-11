package com.currencycalculator.main;

import java.util.*;

import com.currencycalculator.service.MergeSort;

import com.currencycalculator.service.NotesCounter;

public class DriverClass {

	private static final Scanner sc=new Scanner (System.in);
	public static void main(String[] args) {
		
		System.out.println("Enter number of denominations=");
		int noOfDenominations = sc.nextInt();
		System.out.println("Enter the currency denominations");
		
		int [] denominationArray=new int[noOfDenominations];
		
		for (int i=0;i<noOfDenominations;i++) {
			
			denominationArray[i]=sc.nextInt();
			
		}
		
		MergeSort mergeSort=new MergeSort();
		mergeSort.mergeSort(denominationArray,0,denominationArray.length-1);
		
		System.out.println("The denominations in descending order are:");
		for (int i=0;i<	denominationArray.length;i++) {
			
			System.out.print(denominationArray[i]);
			System.out.print(",");
		}
		
		
		
		
		System.out.println("\nEnter total amount to be paid");
		int target=sc.nextInt();
		NotesCounter notesCounter=new NotesCounter();
		notesCounter.notesCount(denominationArray, target);
		
		}
	
	
	}
	
	
	
	

