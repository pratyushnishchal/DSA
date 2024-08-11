package com.dsa.array;

import java.util.*;

public class MaxSubarraySum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
//		int maxSum=0;
//		for(int i=0;i<n;i++) {
//			int sum=0;
//			for(int j=i;j<n;j++) {
//				sum+=arr[j];
//				maxSum=Math.max(maxSum, sum);
//			}
//		}
//		System.out.println(maxSum);
		
//		optimal solution:
//		kadane algorithm
		
		int maxi=Integer.MIN_VALUE;
		int sum=0;
		int start=0;
		int ansStart=-1;
		int ansEnd=-1;
		for(int i=0;i<n;i++) {
			if(sum==0) {
				start=i;
			}
			sum=sum+arr[i];
			if(sum>maxi) {
				maxi=sum;
				ansStart=start;
				ansEnd=i;
			}
			if(sum<0) {
				sum=0;
			}
			if(maxi<0) {
				maxi=0;
			}
		}
		for(int i=ansStart;i<=ansEnd;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.println(maxi);

	}

}
