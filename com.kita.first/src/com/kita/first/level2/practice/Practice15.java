package com.kita.first.level2.practice;

import java.util.Scanner;

public class Practice15 {
 public static void main(String[] args) {
	 
//	 //야구게임 만들기
	 
	 final int LEN = 3;
	 int[] rArr = new int[LEN]; //게임 칸 개수
	 int[] myArr = new int[LEN]; //내가 입력한 값 배열
	 int max = 9;
	 int min = 1;
	 int strike;
	 int ball;
	 
	 Scanner sc = new Scanner(System.in);
	 
	 System.out.println("숫자야구게임 시작!");
	 //컴퓨터가 랜덤한 정수값을 뽑아서 rArr에 담기, 중복 허용 X
	 
	 for(int i = 0; i<rArr.length; i++) {
	 rArr[i] = (int)(Math.random() * (max - min +1) + min);
	      for(int z = 0; z<i; z++) {
	    	  if(rArr[i] == rArr[z]) {
	    		  i--;
	    		  break;
	    	  }
	      }
	 }
	 
	 
	 while(true) {
		 //내가 정수값 3개 입력 받아서 myArr에 넣기
		 //S와B와O개수 체크
		 if(strike == LEN) {
			 break;
		 }
		 
		//s,b,o개수 체크 
	 }
	 System.out.println("게임종료!");
	
	 
	
	 
	
	 
	 
	 
	 
	 
	 
 }
}
