package com.javaex.practice;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자 3개를 입력해주세요");
		System.out.print("숫자 1:");
		int num1 = sc.nextInt();
		System.out.print("숫자 2:");
		int num2 = sc.nextInt();
		System.out.print("숫자 3:");
		int num3 = sc.nextInt();
		
		if(num1<num2) {
		 	System.out.println("가장 작은수는"+num1+"입니다.");
		}
		else if(num2<num3) {
			System.out.println("가장 작은수는"+num2+"입니다.");
		}
		else {
			System.out.println("가장 작은수는"+num3+"입니다.");
		}
		
		
		
		
		
		sc.close();
	}

}
