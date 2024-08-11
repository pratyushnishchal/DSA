package com.dsa.array;

import java.util.*;

public class DuplicateEle {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		Set<Integer> s=new HashSet<Integer>();
		for(int i=0;i<n;i++) {
			int duplicate=arr[i];
			for(int j=i+1;j<n;j++) {
				if(duplicate==arr[j]) {
					s.add(duplicate);
				}
			}
		}
		System.out.println(s);
	}

}
