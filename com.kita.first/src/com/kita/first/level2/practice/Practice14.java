package com.kita.first.level2.practice;

public class Practice14 {
public static void main(String[] args) {
	
	//성적 배열 
	//국어합계:?, 평균:?
	//수학, 영어 "
	//전체합계:? , 전체평균: ?
	
	//hint 과목이름 배열, 각 과목 성적 합계배열
	
	int[][] arr = {
			{67, 49, 87}, //국어성적
			{89, 92, 56}, //수학
			{76, 39, 98}  //영어
	};
	//과목이름 배열
	String[] clsArr = {"국어", "수학", "영어"};
	
	
	//각 과목 성적 합계배열
	int[] sumArr = new int[clsArr.length];
	
	
	for(int i = 0; i<arr.length; i++) {
		for(int z = 0; z<arr[i].length; z++) {
			sumArr[i] += arr[i][z];
		}
	}
	
	for(int i = 0; i<arr.length; i++) {
		System.out.printf("%s합계: %d, 평균: %.1f\n", clsArr[i], sumArr[i], 
				(float)sumArr[i]/arr[i].length);
	}
	
	int totalSum = 0;
	int totalCnt = 0;
	
	for(int i = 0; i<sumArr.length; i++) {
		totalSum += sumArr[i];
		totalCnt += arr[i].length;
	}
	System.out.printf("전체합계: %d, 평균: %.1f\n", totalSum,
			(float)totalSum/totalCnt);	
}
	

}
