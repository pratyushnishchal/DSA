package com.dsa.array;

import java.util.*;

public class AlternatePosAndNegNumbers {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		
		List<Integer> pos=new ArrayList<Integer>();
		List<Integer> neg=new ArrayList<Integer>();
		for(int i=0;i<n;i++) {
			if(arr[i]>0) {
				pos.add(arr[i]);
			}
			else {
				neg.add(arr[i]);
			}
		}
		for(int i=0;i<n/2;i++) {
			arr[2*i]=pos.get(i);
			arr[2*i+1]=neg.get(i);
		}
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");			
		}
		
	}
}

//{1,2,-3,-1,-2,3}
//1 -3 2 -1 3 -2