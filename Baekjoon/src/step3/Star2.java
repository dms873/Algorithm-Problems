package step3;

import java.util.Scanner;

public class Star2 {

	/**
	 * ABOUT
	 *
	 * DATE: 2022-02-06
	 * AUTHOR: dms873
	 *
	 * URL: https://www.acmicpc.net/problem/2439
	 *
	 * COMMENT: Scanner로 N을 입력받은 후 for문을 이용해 * 출력
	 **/
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		for(int i = 1; i <= N; i++) {
			for(int j = 1; j <= N - i; j++) {
				System.out.print(" ");
			}
			for(int k = 1; k <= i; k++) {
				System.out.print("*");				
			}
			System.out.println();
		}
		sc.close();
	}
	
}
