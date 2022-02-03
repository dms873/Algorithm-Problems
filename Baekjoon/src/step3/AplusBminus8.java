package step3;

import java.util.Scanner;

public class AplusBminus8 {

	/**
	 * ABOUT
	 *
	 * DATE: 2022-02-04
	 * AUTHOR: dms873
	 *
	 * URL: https://www.acmicpc.net/problem/11022
	 *
	 * COMMENT: Scanner로 A, B를 입력받은 후 for문을 이용해 출력
	 **/
	
	public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in);
			int T = sc.nextInt();
			
			for(int i = 1; i <= T; i++) {
				int A = sc.nextInt();
				int B = sc.nextInt();
				
				System.out.println("Case #" + i + ": " + A + " + " + B + " = " + (A + B));
			}
			sc.close();
		
	}
	
	
	
}
