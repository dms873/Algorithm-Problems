package step5;

import java.util.Arrays;
import java.util.Scanner;

public class MinMax {
	
	/**
	* ABOUT
	*
	* DATE: 2022-02-11
	* AUTHOR: dms873
	*
	* URL: https://www.acmicpc.net/problem/10818
	*
	* COMMENT:
	* Arrays.sort()메소드를 사용해 오름차순으로 정렬하고 최소값(arr[0]), 
	* 최대값(arr.length-1)을 구한다.
	**/
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		int[] arr = new int[N];
		
		for(int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();
		Arrays.sort(arr);
		System.out.print(arr[0] + " " + arr[N - 1]);
		
	}
}
