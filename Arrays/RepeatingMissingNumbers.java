package com.dsa.array;

import java.util.*;

public class RepeatingMissingNumbers {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int sum=0;
		int summation=n*(n+1)/2;
		int x=0;
		for(int i=0;i<n;i++) {
			int count=0;
			
			for(int j=i+1;j<n;j++) {
				if(arr[i]==arr[j]) {
					count++;
				}
				
			}
//			8-2=6
//			10-6
			sum+=arr[i];
			if(count>0) {
				x=arr[i];
				System.out.println("Repeating="+x);				
			}
		}
			int res=summation-(sum-x);
			System.out.println("Missing="+res);
	}
}
	

