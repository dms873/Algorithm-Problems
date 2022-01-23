package step2;

import java.util.Scanner;

public class TestScore {
	
	/**
	* ABOUT
	*
	* DATE: 2022-01-24
	* AUTHOR: dms873
	*
	* URL: https://www.acmicpc.net/problem/9498
	*
	* COMMENT:
	* if-else if-else 문을 사용하여 경우의 수 처리
	**/
	
	public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        
        if(A >= 90) {
            System.out.println("A");
        } else if(A >= 80) {
            System.out.println("B");
        } else if(A >= 70) {
            System.out.println("C");
        } else if(A >= 60) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }
        sc.close();
    } 
	
}
