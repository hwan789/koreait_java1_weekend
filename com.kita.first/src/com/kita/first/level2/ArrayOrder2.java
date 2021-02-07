package com.kita.first.level2;

public class ArrayOrder2 {
public static void main(String[] args) {
	
	int[] arr = {34, 67, 2, 11, 6, 90};
	int min; // 가작 작은 값의 인덱스 담을 변수
	int temp; //임시로 값 저장하는 변수
	
	//arr를 선택정렬로 정렬 후에 forEach문 사용해서 arr 안의 값 출력
	min = arr[2];
	temp = arr[0];
	
	//arr.length-1:가장 마지막 인덱스 왜? 1234아닌 0123이 때문
	for(int i = 0; i<arr.length-2; i++) {
		min = i;
		for(int z=i+1; z<arr.length-1; z++) { //i 보다 한자리 더 뒤에 수랑 비교해야하니까 z=i+1, 제일 뒤 인덱스까지 비교해야하니까 length-1
			if(arr[min] > arr[z]) { //arr[min]값이랑 arr[z]값 비교하다가 arr[z]값이 더 작을 때 
				
				min = z;
			}
		}
		//temp 사용해서 값 교환
		if(min != i) {
			temp = arr[i];
			arr[i] = arr[min];
			arr[min] = temp;
		}
	}
	for(int val : arr) {
		System.out.print(val + ", ");
	}
}
}
