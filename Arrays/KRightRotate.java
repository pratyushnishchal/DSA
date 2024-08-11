package com.dsa.array;
import java.util.Scanner;
public class KRightRotate {

	public static void main(String[] args) {
//		1 2 3 4 5
//		5 1 2 3 4	
//		4 5 1 2 3
//		3 4 5 1 2 
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of elements");
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter number of rotations");
		int k=sc.nextInt();
		
		for(int i=0;i<k;i++) {
			int last=arr[n-1];
			for(int j=n-1;j>0;j--) {
				arr[j]=arr[j-1];
			}
			arr[0]=last;
		}
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
