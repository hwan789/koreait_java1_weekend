package com.kita.first.level1;

public class Variable1 { 
    public static void main(String[]args) {
    	
    	char v1 = 'A';
    	
    	byte v2; 
    	short v3;
    	int v4 = 6; //정수형 기본타입
    	v4 = 3;
    	System.out.println(v4);
    	v4 = 5;
    	System.out.println(v4);
    	long v5 = 214748364234l; //long 인식하게하려면 'l'붙여야함
    	
    	float v6 = 20.1f; //실수표시하려면 'f'붙여야함 
    	double v7 = 20.1; //실수형 기본타입
    	
    	boolean v8; //참과 거짓의 값
        v8 = true; //'='오른쪽의 값을 왼쪽에 넣는다
        v8 = false;
        
        //string 참조변수
        
        final int MY_MAX_HEIGHT;//'final'붙으면 값 고정, 변경 불가능
        MY_MAX_HEIGHT = 163;
        //final String MY_STRING = "안녕";
        
        
    
    } 
}
