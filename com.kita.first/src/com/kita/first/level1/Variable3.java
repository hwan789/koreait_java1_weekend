package com.kita.first.level1;

public class Variable3 {
   public static void main(String[]args) {

	//int<long<float<double<String
	int v1 = 3;
	int v2 = 5;
	System.out.println(v1 + v2);
	
	int result1 = v1 + v2;
	System.out.println(result1);
	
	double v3 = 2.4;
	int result2 = v1 + (int)v3; //'()'형변환
	System.out.println(result2); //소수점은 버림
	
	long v4 = 12L;
	double result3 = v4;
	float result4 = v4;
	
	System.out.println(1 + 2 + 3);
	System.out.println(1 + 2 + "3");
	System.out.println("1" + 2 + 3);
	System.out.println(1 + "2" + 3);
	
	String s1 = "123"; //문자형은 강제 형변환이 안됨 (int)123 불가능
	int n4 = Integer.parseInt(s1); //
	int n5 = 1;
	System.out.println(n4 + n5);
	
	
   }
}