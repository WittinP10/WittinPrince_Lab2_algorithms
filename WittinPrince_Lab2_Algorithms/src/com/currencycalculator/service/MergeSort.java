package com.currencycalculator.service;

public class MergeSort {

	public void mergeSort(int[] arr, int left, int right) {
		// TODO Auto-generated method stub
		if(left<right) {
			
			int mid=(left+right)/2;
			
			mergeSort(arr,left,mid);
			mergeSort(arr,mid+1,right);
			merge(arr,left,mid,right);
			
		}
		
		
	}
	
	public static void printArray(int[] arr){
		
		for (int i=0;i<arr.length;i++) {
			
			System.out.print(arr[i]);
			
		}
		

	}
	
	private void merge(int[] arr,int left,int mid,int right) {
		
		int[] larr=new int[mid-left+1];
		int[] rarr=new int[right-mid];
		
		//System.out.println("After merge");
		//printArray(arr);
		
		
		//System.out.println("Left Array Size:"+larr.length);
		for (int i=0;i<larr.length;i++) {
			
			larr[i]=arr[left+i];
		}
		//System.out.println("Left Array");
		//printArray(larr);
		
		
//		System.out.println("Right Array Size:"+rarr.length);
		for (int j=0;j<rarr.length;j++) {
			
			rarr[j]=arr[mid+1+j];
		}
		
		//System.out.println("Right Array");
		//printArray(rarr);
		
		
		int l=0,r=0,k=left;
		
		while((l<larr.length)&&(r<rarr.length)) {
			if(larr[l]>rarr[r]) {
				arr[k]=larr[l];
				l++;
				k++;
			}else {
				arr[k]=rarr[r];
				r++;
				k++;
			}
		}
			while(l<larr.length) {
				
				arr[k]=larr[l];
				k++;
				l++;
			}
			
			while(r<rarr.length) {
				
				arr[k]=rarr[r];
				k++;
				r++;
			}
		
	}
	
	
	
}
