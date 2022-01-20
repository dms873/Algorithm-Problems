package step1;

import java.util.Scanner;

public class Multiplication {
	public static void main(String[] args) {
		
		/**
		 * ABOUT
		 *
		 * DATE: 2022-01-21
		 * AUTHOR: dms873
		 *
		 * URL: https://www.acmicpc.net/problem/2588
		 *
		 * COMMENT:
		 * Scanner를 사용하여 정수를 입력받아 자리수에 맞게 계산.
		 **/
		
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        
        System.out.println(A * (B%10)); // 일의 자리
        System.out.println(A * (B%100/10)); // 십의 자리
        System.out.println(A * (B/100)); // 백의 자리
        System.out.println(A * B);
        sc.close();
	}
	
	
}
