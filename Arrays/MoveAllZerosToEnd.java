package com.dsa.array;

import java.util.Scanner;

public class MoveAllZerosToEnd {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int count=0;
		for(int i=0;i<n;i++) {
			if(arr[i]==0) {
				count++;
			}
		}
		for(int i=0;i<n;i++) {
			if(arr[i]!=0) {
				System.out.print(arr[i]+" ");
			}
		}
		for(int i=0;i<count;i++) {
			System.out.print("0 ");
		}
	}
}
