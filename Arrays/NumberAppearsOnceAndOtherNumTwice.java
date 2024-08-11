package com.dsa.array;

import java.util.Scanner;

public class NumberAppearsOnceAndOtherNumTwice {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int count=0;
		int res=arr[0];
		for(int i=1;i<n;i++) {
			res=res^arr[i];
		}
		System.out.println(res);

	}

}
