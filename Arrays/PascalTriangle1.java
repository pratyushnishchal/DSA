package com.dsa.array;

import java.util.*;

public class PascalTriangle1 {

	public static void main(String[] args) {
//		Given row number r and column number c. 
//		Print the element at position (r, c) in Pascal’s triangle.
		
//		formula is nCr
//		nCr=n!/r!*(n-r)!
//		10C3=
//		10!/3!*7!=10*9*8*7*6*5*4*3*2*1/(3*2*1)*(7*6*5*4*3*2*1)=10*9*8/(3*2*1)
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int r=sc.nextInt();
		nCr x=new nCr();
		int result=x.pascalTriangle(n, r);
		System.out.println(result);
	}

}
class nCr{
	public long nCr(int n,int r) {
		long res=1;
		for(int i=0;i<r;i++) {
			res=res*(n-i);
			res=res/(i+1);
		}
		return res;
	}
	public int pascalTriangle(int n,int r) {
		int ele=(int)nCr(n-1,r-1);
		return ele;
	}
}
