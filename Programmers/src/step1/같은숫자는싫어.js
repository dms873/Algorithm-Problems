/**
	* ABOUT
	*
	* DATE: 2022-04-07
	* AUTHOR: dms873
	*
	* URL: https://programmers.co.kr/learn/courses/30/lessons/12906
	*
	* COMMENT:  
	* 
	**/

import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        int[] answer = {};
        
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == arr[i+1]) {
                answer += arr[i+1];
                continue;
            } else {
                answer += arr[i];    
            }
            
        }
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        // System.out.println("Hello Java");

        return answer;
    }
}
