package com.dsa.array;
import java.util.Scanner;
public class LeapYear {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first year");
		int y1=sc.nextInt();
		System.out.println("Enter the first year");
		int y2=sc.nextInt();
		for(int i=y1;i<=y2;i++) {
			if(i%4==0 && i%100!=0 || i%400==0) {
					System.out.println(i);
			}
		}
	}

}
