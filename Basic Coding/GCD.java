package com.dsa.basiccodes;

import java.util.Scanner;

public class GCD {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		int gcd=1;
		int i;
		for(i=1;i<=Math.min(n1, n2);i++) {
			if(n1%i==0 && n2%i==0) {
				gcd=i;
			}
			
		}
		System.out.println("gcd = "+gcd);
	}

}
