package com.dsa.array;

import java.util.*;

public class UnionOfTwoSortedArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Set<Integer> s=new HashSet<Integer>();
		List<Integer> ans=new ArrayList<Integer>();
		System.out.println("Enter the size of the array 1");
		int n=sc.nextInt();
		int arr1[]=new int[n];
		System.out.println("Enter the size of the array 2");
		int m=sc.nextInt();
		int arr2[]=new int[m];
		System.out.println("Enter the elements of array 1");
		for(int i=0;i<n;i++) {
			arr1[i]=sc.nextInt();
		}
		System.out.println("Enter the elements of array 2");
		for(int i=0;i<m;i++) {
			arr2[i]=sc.nextInt();
		}
		System.out.println("Enter the elements of array 1");
		for(int i=0;i<n;i++) {
			System.out.print(arr1[i]+" ");
		}
		System.out.println("Enter the elements of array 2");
		
		for(int i=0;i<m;i++) {
			System.out.print(arr2[i]+" ");
		}
		for(int i=0;i<n;i++) {
			s.add(arr1[i]);
		}
		for(int i=0;i<m;i++) {
			s.add(arr2[i]);
		}
		for(int ele:s) {
			ans.add(ele);
		}
		System.out.println(ans);


	}

}
