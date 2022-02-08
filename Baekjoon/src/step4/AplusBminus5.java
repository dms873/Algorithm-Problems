package step4;

import java.util.Scanner;

public class AplusBminus5 {

	/**
	 * ABOUT
	 *
	 * DATE: 2022-02-08
	 * AUTHOR: dms873
	 *
	 * URL: https://www.acmicpc.net/problem/10952
	 *
	 * COMMENT: while문 사용하여 반복
	 **/
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			
			int A = sc.nextInt();
			int B = sc.nextInt();
			
			if(A == 0 && B == 0) {
				break;
			}
			System.out.println(A + B);	
		}		
		sc.close();
	}
	
}
