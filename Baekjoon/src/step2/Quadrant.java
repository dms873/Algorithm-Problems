package step2;

import java.util.Scanner;

public class Quadrant {
	
	/**
	* ABOUT
	*
	* DATE: 2022-01-26
	* AUTHOR: dms873
	*
	* URL: https://www.acmicpc.net/problem/14681
	*
	* COMMENT:
	* if-else if-else 문을 사용하여 경우의 수 처리
	**/
	
	public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in);
	        int x = sc.nextInt();
	        int y = sc.nextInt();
	        
	        if(x > 0 && y > 0) {
	            System.out.println("1");
	        } else if(x < 0 && y > 0) {
	            System.out.println("2");
	        } else if(x < 0 && y < 0) {
	            System.out.println("3");
	        } else {
	            System.out.println("4");
	        }
		
	        sc.close();
	}
	
}
