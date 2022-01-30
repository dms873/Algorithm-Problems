package step1;

import java.util.Scanner;

public class QuestionMark {

	/**
	 * ABOUT
	 *
	 * DATE: 2022-01-31
	 * AUTHOR: dms873
	 *
	 * URL: https://www.acmicpc.net/problem/10926
	 *
	 * COMMENT: Scanner로 문자열 입력받아 입력받은 문자열과 ??!를 함께 나타냄
	 **/

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String id = sc.next();
		System.out.println(id + "??!");
		sc.close();

	}

}
