package com.dsa.array;
import java.util.*;
public class LeaderInAnArray {

	public static void main(String[] args) {
		List<Integer> ans=new ArrayList<Integer>();
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the elements");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("array elements are: ");
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		for(int i=0;i<n;i++) {
			boolean checkGreater=true;
			for(int j=i+1;j<n;j++) {
				if(arr[i]<arr[j]) {
					checkGreater=false;
					break;
				}
			}
			if(checkGreater) {
				ans.add(arr[i]);
			}
		}
		Collections.sort(ans);
		for(int ele:ans) {
			System.out.print(ele+" ");
		}
	}

}
