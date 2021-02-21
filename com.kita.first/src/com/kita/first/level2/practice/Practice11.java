package com.kita.first.level2.practice;

import java.util.Scanner;

public class Practice11 {
	public static void main(String[] args) {
		
//		자판기게임
//		메뉴: 콜라, 사이다, 캔커피, 데자와, 환타, 웰치스
//		가격: 900, 700, 400, 500, 600, 1000
		
      Scanner scan = new Scanner(System.in);
      String[] menuArr = {"콜라", "사이다", "캔커피", 
    		  "데자와", "환타", "웰치스"};
      int[] priceArr = {900, 700, 400, 500, 600, 1000};
      int num;
      int total = 0;
      
      System.out.println("--메뉴--");
      for(int i = 0; i<menuArr.length; i++) {
    	  System.out.printf("%d. %s %d원\n", i+1, menuArr[i], priceArr[i]);
      }
      System.out.println();
      
      while(true) {
    	  //메뉴를 입력하세요(0 입력 시 종료) : 1
    	  System.out.print("메뉴를 입력하세요(0 입력 시 종료):");
    	  num = scan.nextInt();
    	  
    	  if(num < 0 || num > menuArr.length) {
    		  System.out.println("범위 내의 값을 입력해주세요.");
    		  continue;
    	  }else if(num == 0) {
    		  break;
    	  }
    	  
    	  System.out.printf("%s %d원\n", menuArr[num-1], priceArr[num-1]);
    	  total = total + priceArr[num-1];
      }
      
//      System.out.println("합계: " + total + "원");
      System.out.printf("합계 : %d원\n", total);
      

		
		
		
		
		
		
	}

}
