package com.dsa.array;

import java.util.*;

public class LongestSubarrayWithZeroSum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int len=0;
		for(int i=0;i<n;i++) {
			int sum=0;
			for(int j=i;j<n;j++) {
				sum=sum+arr[j];
				if(sum==0) {
					len=Math.max(len, j-i+1);
				}
			}
		}
		System.out.println(len);

	}

}
