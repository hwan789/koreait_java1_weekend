package com.kita.first.level1.practice;

public class Practice01 {
	public static void main(String[] agrs) {
		
		int n1 = 2;
		int n2 = 3;
		
		//if문 사용해서 n1과 n2 비교
		//n1이 n2보다 크다.
		//n1이 n2보다 작다.
		//n1과 n2의 값이 같다.
		
		/*if(n1 > n2); {
			System.out.println("n1이 n2보다 크다.");
		}
		if(n1 < n2); {
			System.out.println("n1이 n2보다 작다.");
		}
		if(n1 == n2); {
			System.out.println("n1과 n2의 값이 같다.");
		}*/  //내가 한 답
		
		//정답
		if(n1 > n2) {
			System.out.println("n1이 n2보다 크다.");
		}else if(n1 < n2) {
			System.out.println("n1이 n2보다 작다.");
		}else {
			System.out.println("n1과 n2의 값이 같다.");
		}
		
	}

}
