package com.dsa.array;

import java.util.Scanner;

public class BestTimeToBuyAndSellStock {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int mini=arr[0]; //1
		int maxProfit=0;//4
		for(int i=1;i<n;i++) {
			int cost=arr[i]-mini;
			maxProfit=Math.max(maxProfit, cost);
			mini=Math.min(mini, arr[i]);
		}
		System.out.println(maxProfit);
		

	}

}
