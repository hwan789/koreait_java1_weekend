package com.kita.first.level2.practice;

public class Practice05 {
	public static void main(String[] args) {
		
		
		
		//while 조건식을 사용하여
		//1~100을 모두 더한 값이 출력되도록 하시오
		//합계 5050
		
		int i = 1;
		int sum = 0;
		
		while(true) {
			if(i == 101) {
				break;
			}
			sum = sum + i;
			i++;
		}
		System.out.printf("합계: %d", sum);
		
		
	}

}
