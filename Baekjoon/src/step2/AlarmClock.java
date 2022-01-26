package step2;

import java.util.Scanner;

public class AlarmClock {

	/**
	* ABOUT
	*
	* DATE: 2022-01-27
	* AUTHOR: dms873
	*
	* URL: https://www.acmicpc.net/problem/2884
	*
	* COMMENT:
	* 45분 일찍 알람 설정을 위해 45분 미만이면 시간을 1개 줄이고 분은 15분을 더해줬다.
	**/
	
	public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int M = sc.nextInt();
        
        if(M < 45) {
            H--;
            M += 15;
            if(H < 0) {
                H = 23;
            } 
            System.out.println(H + " " + M);
        } else {
            System.out.println(H + " " + (M - 45));
        } 
        sc.close();
		
	}
	
}
