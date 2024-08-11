// when positive and negative is not same.

package com.dsa.array;

import java.util.*;
public class AlternatePosAndNegNumbers2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
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
		if(pos.size()>neg.size()) {
			for(int i=0;i<neg.size();i++) {
				arr[2*i]=pos.get(i);
				arr[2*i+1]=neg.get(i);
			}
			int index=2*neg.size();
			for(int i=neg.size();i<pos.size();i++) {
				arr[index]=pos.get(i);
				index++;
			}
		}
//		1 2 -1 -3 -1 -3 -5
//		1 2
//		-1 -3-1-3 -5
//		1 -1 2 -3 
		else {
			for(int i=0;i<pos.size();i++) {
				arr[2*i]=pos.get(i);
				arr[2*i+1]=neg.get(i);
			}
			int index=2*pos.size();
			for(int i=pos.size();i<neg.size();i++) {
				arr[index]=neg.get(i);
				index++;
			}
		}
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}

	}

}
