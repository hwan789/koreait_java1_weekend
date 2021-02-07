package com.kita.first.level2;

public class Random {
public static void main(String[] args) {
	
	double n = Math.random(); //0 ~ 0.999~ , 0 <= n < 1 
	
	System.out.println("n: "+n);
	
	//0~9
	int n2 = (int)(Math.random() * 10);
	System.out.println("n2: " +n2);
	
	//1~5
	int n3 = (int)(Math.random() * 5 + 1);
	System.out.println("n3:" +n3);
	
	//2~13
	int n4 = (int)(Math.random() * 12 + 2);
	System.out.println("n4: "+n4);
	
	//17~51
	//0~34 0 <= n <35
	int n5 = (int)(Math.random() * 35 + 17);
	System.out.println("n5: " +n5);
	
	int max = 51;
	int min = 17;
	int rNUm = (int)(Math.random() * (max - min +1)+min);
	
}
}
