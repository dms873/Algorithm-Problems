package step2;

import java.util.Scanner;

public class ComparingTheTwoNumbers {
	public static void main(String[] args) {
		
		/**
		* ABOUT
		*
		* DATE: 2022-01-23
		* AUTHOR: dms873
		*
		* URL: https://www.acmicpc.net/problem/1330
		*
		* COMMENT:
		* if-else if-else 문을 사용하여 경우의 수 처리
		**/
		
		 Scanner sc = new Scanner(System.in);
	        int A = sc.nextInt();
	        int B = sc.nextInt();
	        
	        if(A > B) {
	            System.out.println(">");
	        } else if(A < B) {
	            System.out.println("<");
	        } else {
	            System.out.println("==");
	        }
	        sc.close();
	}
}
