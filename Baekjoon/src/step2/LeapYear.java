package step2;

import java.util.Scanner;

public class LeapYear {

	/**
	 * ABOUT
	 *
	 * DATE: 2022-01-25
	 * AUTHOR: dms873
	 *
	 * URL: https://www.acmicpc.net/problem/2753
	 *
	 * COMMENT:
	 * 윤년은 연도가 4의 배수이면서, 100의 배수가 아닐 때 또는 400의 배수일 때이다.
	 **/

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();

		if(A % 4 == 0 && (!(A % 100 == 0) || (A % 400 == 0))) {
			System.out.println("1");
		} else {
			System.out.println("0");
		}
		sc.close();

	}

}
