package com.dsa.array;

import java.util.Scanner;

public class MissingNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n-1];
		for(int i=0;i<n-1;i++) {
			arr[i]=sc.nextInt();
		}
		int sum1=0;
		for(int i=0;i<n-1;i++) {
			sum1=sum1+arr[i];
		}
		int sum=n*(n+1)/2;
		System.out.println("Missing number is "+(sum-sum1));
	}

}
