package step1;

import java.util.Scanner;

public class Remainder {
	public static void main(String[] args) {
		/**
		 * ABOUT
		 *
		 * DATE: 2022-01-21
		 * AUTHOR: dms873
		 *
		 * URL: https://www.acmicpc.net/problem/10430
		 *
		 * COMMENT:
		 * Scanner를 사용하여 정수를 입력받아 나머지 값을 구하기 위해 % 연산자 사용
		 **/
		
		 Scanner sc = new Scanner(System.in);
	        int A = sc.nextInt();
	        int B = sc.nextInt();
	        int C = sc.nextInt();
	        
	        System.out.println((A+B)%C);
	        System.out.println(((A%C) + (B%C))%C);
	        System.out.println((A*B)%C);
	        System.out.println(((A%C) * (B%C))%C);
	        sc.close();
	}
}
