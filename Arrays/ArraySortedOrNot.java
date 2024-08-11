package com.dsa.array;

import java.util.Scanner;

public class ArraySortedOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
//2 1 4 3 5
		boolean isSorted=false;
		for(int i=1;i<n;i++) {
			if(arr[i]>=arr[i-1]) {
				isSorted=true;
			}
			else {
				isSorted=false;
				break;
			}
		}
		if(isSorted) {
			System.out.println("Sorted");
		}
		else {
			System.out.println("Not Sorted");
		}
	}

}
