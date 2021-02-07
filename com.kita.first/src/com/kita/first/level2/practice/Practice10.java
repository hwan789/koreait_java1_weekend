package com.kita.first.level2.practice;

public class Practice10 {
public static void main(String [] args) {
	
	//int 배열 9칸짜리 만들고
	//1~9랜덤으로 값을 뽑아 배열에 집어넣기
	//(심화)랜덤값 겹치지 않게 배열에 집어넣기
	
	int max = 9;
	int min = 1;
	int Random_Num = 0;
	
	
	int[] arr = new int[9];
	for(int i = 0; i<arr.length; i++) {
		arr[i] = i+1;
		System.out.print(arr[i] + ", ");
	}
	System.out.print("\n");
	
	int[] arr2 = new int[9];
	for(int j = 0; j<arr.length; j++) {
		arr[j] = (int)(Math.random() * (max - min +1)+min);
		System.out.print(arr[j] + ", ");
	}
	System.out.print("\n");
	
	for(int i=0; i<arr.length; i++) {
		arr[i] = (int)(Math.random() * (max - min +1) + min);
		for(int z=0; z<i; z++) { //z<=i-1
			if(arr[i] == arr[z]) {
				i--;
				break;
			}
		}
	}
	for(int val : arr) {
		System.out.print(val + ", ");	
	}
	
}
}
