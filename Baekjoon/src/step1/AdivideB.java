package step1;

import java.util.Scanner;

public class AdivideB {
	/**
	 * ABOUT
	 *
	 * DATE: 2022-01-20
	 * AUTHOR: dms873
	 *
	 * URL: https://www.acmicpc.net/problem/1008
	 *
	 * COMMENT:
	 * Scanner를 사용하여 정수를 입력받아 나눠줌
	 **/

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();

		System.out.println(A / B);
		sc.close();
	}
}