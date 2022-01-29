package step3;

import java.util.Scanner;

public class AplusBminus3 {

	/**
	* ABOUT
	*
	* DATE: 2022-01-29
	* AUTHOR: dms873
	*
	* URL: https://www.acmicpc.net/problem/10950
	*
	* COMMENT: for문을 이용하여 반복 시켜줌
	**/
	
	public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in);
	        int T = sc.nextInt();
	        int arr[] = new int[T];
	        
	        for(int i = 0; i < T; i++) {
	            int A = sc.nextInt();
	            int B = sc.nextInt();
	            arr[i] = A + B;
	        }
	        sc.close();
	        
	        for(int i : arr) {
	            System.out.println(i);
	        }
	        sc.close();
	}
}
