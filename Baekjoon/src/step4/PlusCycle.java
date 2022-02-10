package step4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PlusCycle {

	/**
	 * ABOUT
	 *
	 * DATE: 2022-02-10
	 * AUTHOR: dms873
	 *
	 * URL: https://www.acmicpc.net/problem/1110
	 *
	 * COMMENT: 일의 자릿수는 새로운 수의 십의 자리로, 일의 자릿수와 십의 자릿수를 더한 값의 일의 자릿수는 새로운 수의 일의 자리로 간다.(만약 한 자릿수 정수면 앞에 0을 붙여 더한다.)
	 * @throws IOException 
	 * @throws NumberFormatException 
	 **/

	public static void main(String[] args) throws IOException {

		// 일의 자릿수는 새로운 수의 십의 자릿수로 간다.
		// N의 일의 자릿수는 새로운 수(T)의 십의 자릿수로 간다.
		// T = (N % 10) * 10 // T의 십의 자릿수

		// 각 자릿수의 합 구하기
		// 십의 자릿수는 나누기 10을 하고, 1의 자릿수는 % 10을 사용한다.
		// 이 두 개를 더한 뒤 10으로 나눈 나머지가 N의 각 자릿수의 합이 일의 자릿수가 T의 1의 자릿수가 된다.
		// T = ((N % 10) * 10) + (((N / 10) + (N % 10)) % 10)

		// 가장 처음 입력값과의 비교를 해야함.
		// 처음 입력값을 복사한 변수
		// 반복문이 몇 번 반복되었는지 세어주는 변수
		// 처음 입력값과 새로운 변수가 같을 경우 반복문을 종료하기 위한 조건문

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());

		int cnt = 0;
		int copy = N;

		while (true) {
			N = ((N % 10) * 10) + (((N / 10) + (N % 10)) % 10);
			cnt++;
			if (copy == N) {
				break;
			}
		}
		System.out.println(cnt);

	}

}
