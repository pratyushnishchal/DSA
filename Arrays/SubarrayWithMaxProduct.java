package com.dsa.array;

import java.util.Scanner;

public class SubarrayWithMaxProduct {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int maxProd=0;
		for(int i=0;i<n;i++) {
			int prod=1;
			for(int j=i;j<n;j++) {
				prod=prod*arr[j];
				maxProd=Math.max(maxProd, prod);
			}
		}
		System.out.println(maxProd);

	}

}
