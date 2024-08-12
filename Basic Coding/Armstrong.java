package com.dsa.basiccodes;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int armnum=n;
		int n1=0;
		int len=String.valueOf(n).length();
		while(n>0) {
			int temp=n%10;
			n1=(int) (n1+Math.pow(temp, len));
			n=n/10;
		}
		if(n1==armnum) {
			System.out.println("Armstrong number");			
		}
		else {
			System.out.println("Not an Armstrong number");
		}
	}

}
