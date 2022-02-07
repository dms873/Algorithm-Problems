package step3;

import java.util.Scanner;

public class SmallerThanX {

	/**
	 * ABOUT
	 *
	 * DATE: 2022-02-07
	 * AUTHOR: dms873
	 *
	 * URL: https://www.acmicpc.net/problem/10871
	 *
	 * COMMENT: 입력받음과 동시에 if문으로 검사해서 주어진 수보다 작으면 StringBuilder에 저장
	 **/

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int X = sc.nextInt();

		StringBuilder sb = new StringBuilder();

		for(int i = 0; i < N; i++) {
			int value = sc.nextInt();
			if(value < X) {
				sb.append(value + " ");
			}
		}
		System.out.println(sb);
		sc.close();
	}
}
