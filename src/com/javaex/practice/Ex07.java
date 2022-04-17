package com.javaex.practice;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 숫자:");
		int fstnum = sc.nextInt();
		System.out.print("두번째 숫자:");
		int scdnum = sc.nextInt();
		
		if(fstnum>scdnum) {
			System.out.println("몫:" +fstnum/scdnum);
			System.out.println("나머지:" +fstnum%scdnum);
		}
		else{
			System.out.println("몫:"+scdnum/fstnum);
			System.out.println("나머지:" +scdnum%fstnum);
		}
		
		
		
		
			
			
		
		
		
		
		
		
		sc.close();
	}

}
