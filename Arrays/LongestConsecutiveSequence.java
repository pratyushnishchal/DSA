package com.dsa.array;

import java.util.*;

public class LongestConsecutiveSequence {

	public static void main(String[] args) {
//	Brute Solution
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
//		100 200 1 3 2 4
//		int lenSeq=1;
//		for(int i=0;i<n;i++) {
//			int count=1;
//			int x=arr[i];
//			while(linearSearch(arr,x+1)==true) {
//				x++;
//				count++;
//			}
//			lenSeq=Math.max(lenSeq, count);
//		}
//		System.out.println(lenSeq);
		
//		better solution-by sorting
	
		Arrays.sort(arr);
		int count=0;
		int lastSmaller=Integer.MIN_VALUE;
		int lenSeq=1;
		for(int i=0;i<n;i++) {
			if(arr[i]-1==lastSmaller) {
				count++;
				lastSmaller=arr[i];
			}
			else if(arr[i]!=lastSmaller) {
				count=1;
				lastSmaller=arr[i];
			}
			lenSeq=Math.max(lenSeq, count);
		}
		System.out.println(lenSeq);
	}
//	public static boolean linearSearch(int arr[], int ele) {
//		for(int i=0;i<arr.length;i++) {
//			if(arr[i]==ele) {
//				return true;
//			}
//		}
//		return false;
//	}

}
