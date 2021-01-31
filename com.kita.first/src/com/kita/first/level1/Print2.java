package com.kita.first.level1;

public class Print2 {
	public static void main(String[] args) {
		String name = "김영환";
		int age = 24;
		
		//제 이름은 김영환이고 나이는 24세 입니다.
		System.out.println("제 이름은 " + name + "이고 나이는" + age + "세입니다.");
		
		//System.out.printf("문자열 형식", 변수1, 변수2, ...);
		System.out.printf("제 이름은 %s이고 나이는 %d세입니다.\n", name, age);
		//%d를 %4d 처럼 숫자를 넣으면 정수앞에 칸을 더 만든다는 뜻 = 4d포함 4칸만듦
		
		double grade = 4.333333;
		System.out.printf("제 학점은 평균%.2f입니다.\n", grade);
	}

}
