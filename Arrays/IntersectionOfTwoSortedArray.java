package com.dsa.array;

import java.util.*;

public class IntersectionOfTwoSortedArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array 1");
		int n=sc.nextInt();
		int arr1[]=new int[n];
		System.out.println("Enter the size of the array 2");
		int m=sc.nextInt();
		int arr2[]=new int[m];
		List<Integer> ans=new ArrayList<Integer>();
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
		int visited[]=new int[m];
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				if(arr1[i]==arr2[j] && visited[j]==0) {
					ans.add(arr2[j]);
					visited[j]=1;
					break;
				}
				else if(arr2[j]>arr1[i]) {
					break;
				}
			}
			System.out.println(ans);
		}
//	1 1 2 3 4 5 6
//	2 2 2 3 5 7 8
	}

}
