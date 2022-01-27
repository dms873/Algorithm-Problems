package step3;

import java.util.Scanner;

public class Gugudan {

	/**
	* ABOUT
	*
	* DATE: 2022-01-28
	* AUTHOR: dms873
	*
	* URL: https://www.acmicpc.net/problem/2739
	*
	* COMMENT:
	* for문을 이용하여 반복 시켜줌
	**/
	
	public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in);
	        int N = sc.nextInt();
	        
	        for(int i = 1; i < 10; i++) {
	            System.out.println(N + " * " + i + " = " + N*i);
	        }
	        sc.close();
		
	}
	
}
