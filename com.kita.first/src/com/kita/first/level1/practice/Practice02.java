package com.kita.first.level1.practice;

import java.util.Scanner; //컨트롤+쉬프트+o

public class Practice02 {
	public static void main(String[] args) {
		///스캐너로 정수값 하나 입력받고
		// 그 값이 홀수면 "홀수입니다."
		// 짝수면 "짝수 입니다."
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("정수값을 입력하시오.:");
		int num = scan.nextInt();
		scan.close();
		if(num % 2 == 1) {
			System.out.println("홀수입니다.");
		} else {
			System.out.println("짝수입니다.");
		}
		
			
		
		
		
		
		
		
		
		
	}

}
