package com.kita.first.level2.practice;

import java.util.Scanner;

public class Practice07 {
public static void main(String[] args) {
	
	//랜덤값 10~90을 맞추는 게임
	//UP DOWN GREAT!!
	
	int max = 90;
	int min = 10;
	int rN = (int)(Math.random()*(max - min+1)+min);
	System.out.println("rN:" +rN);
	Scanner sc = new Scanner(System.in);
	int myNum;
	
	
	while(true ) {
		System.out.println("정수 하나 입력하시오:");
		myNum = sc.nextInt();
		if(myNum > max || myNum < min) {
			System.out.println("잘못 입력했습니다. 다시입력해주세요.");
			continue;
		}
		if(rN > myNum){
			System.out.println("UP");
		}else if(rN < myNum) {
			System.out.println("DOWN");
		}else {
			sc.close();
			System.out.println("GREAT!!!");
			break;
			
		}
		

		
	}
	
	
	

	
	
	
	
	
}
}
