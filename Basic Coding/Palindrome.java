package com.dsa.basiccodes;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int revNum=0;
		int n1=n;
		while(n>0) {
			int temp=n%10;
			revNum=temp+(revNum*10);
			n=n/10;
		}
		if(n1==revNum) {
			System.out.println("palindrome number");
		}
		else {
			System.out.println("not a palindrome number");
		}

	}

}
