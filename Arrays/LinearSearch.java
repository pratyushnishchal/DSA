package com.dsa.array;

import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter Search element");
		int x=sc.nextInt();
		for(int i=0;i<n;i++) {
			if(arr[i]==x) {
				System.out.println(x+" is present in the "+i+" position");
			}
		}
	}

}
