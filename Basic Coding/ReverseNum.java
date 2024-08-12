package com.dsa.basiccodes;

import java.util.Scanner;

public class ReverseNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int revNum = 0;
		while (n > 0) {
			int temp = n % 10;
			revNum = temp + (revNum * 10);
			n = n / 10;
		}
		System.out.println(revNum);
	}

}
