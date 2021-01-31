package com.kita.first.level2.practice;

public class Practice03 {
	public static void main(String[] args) {
//		2~9단 찍기
//		2 * 1 = 2 
//		...
//		9 * 0 = 81
		
		
		for(int i = 2; i <= 9; i++) {
			for(int j = 1; j <= 9; j++) {
				System.out.printf("%d * %d = %d\n", i, j, i * j);
				
			}
			System.out.printf("\n");
		}
	}
}
	