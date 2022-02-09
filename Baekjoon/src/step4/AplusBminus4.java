package step4;

import java.util.Scanner;

public class AplusBminus4 {

	/**
	 * ABOUT
	 *
	 * DATE: 2022-02-09
	 * AUTHOR: dms873
	 *
	 * URL: https://www.acmicpc.net/problem/10951
	 *
	 * COMMENT: while문 사용하여 반복
	 **/
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while (sc.hasNextInt()) {
			
			int A = sc.nextInt();
			int B = sc.nextInt();
			System.out.println(A + B);
			
		}
		sc.close();
		
	}
	
}
