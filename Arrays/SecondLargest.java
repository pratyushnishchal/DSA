package com.dsa.array;

import java.util.Scanner;

public class SecondLargest {

	public static void main(String[] args) {
		// Second Largest Element in an array
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int temp;
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				if(arr[i]>arr[j]) {
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				}
			}
			
		}
		System.out.println(arr[n-2]);
		
		

	}

}
