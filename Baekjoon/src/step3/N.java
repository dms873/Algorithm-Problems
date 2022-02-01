package step3;

import java.util.Scanner;

public class N {


	/**
	 * ABOUT
	 *
	 * DATE: 2022-02-01
	 * AUTHOR: dms873
	 *
	 * URL: https://www.acmicpc.net/problem/2741
	 *
	 * COMMENT: Scanner로 N을 입력받은 후 for문을 이용해 출력
	 **/

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		for(int i =1; i <= N; i++) {
			System.out.println(i);
		}
		sc.close();

	}

}
