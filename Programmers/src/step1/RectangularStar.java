package step1;

import java.util.Scanner;

public class RectangularStar {

	/**
	* ABOUT
	*
	* DATE: 2022-02-12
	* AUTHOR: dms873
	*
	* URL: https://programmers.co.kr/learn/courses/30/lessons/12969?language=java
	*
	* COMMENT:
	* for 문을 이용하여 별찍기
	**/
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		for(int i = 0; i < b; i++) {
			for(int j = 1; j <= a; j++) {				
				System.out.print("*");
			}
			System.out.println();				
		}
		sc.close();
		
	}
}
