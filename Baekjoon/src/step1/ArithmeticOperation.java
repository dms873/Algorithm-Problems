package step1;

import java.util.Scanner;

public class ArithmeticOperation {
	public static void main(String[] args) {
		/**
		 * ABOUT
		 *
		 * DATE: 2022-01-21
		 * AUTHOR: dms873
		 *
		 * URL: https://www.acmicpc.net/problem/10869
		 *
		 * COMMENT:
		 * Scanner를 사용하여 정수를 입력받아 연산함.
		 **/
		
		  Scanner sc = new Scanner(System.in);
	        int A = sc.nextInt();
	        int B = sc.nextInt();
	        
	        System.out.println(A + B);
	        System.out.println(A - B);
	        System.out.println(A * B);
	        System.out.println(A / B);
	        System.out.println(A % B);
	        sc.close();
	}
}
