package step3;

import java.util.Scanner;

public class Sum {

	/**
	* ABOUT
	*
	* DATE: 2022-01-30
	* AUTHOR: dms873
	*
	* URL: https://www.acmicpc.net/problem/8393
	*
	* COMMENT: for문을 이용하여 반복 시켜서 sum변수에 더해줌
	**/
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for(int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println(sum);
        sc.close();
		
	}
	
}
