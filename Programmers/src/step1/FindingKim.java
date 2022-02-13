package step1;

public class FindingKim {

	/**
	* ABOUT
	*
	* DATE: 2022-02-13
	* AUTHOR: dms873
	*
	* URL: https://programmers.co.kr/learn/courses/30/lessons/12919
	*
	* COMMENT:
	* for 문을 이용하여 별찍기
	**/
	
	// import java.util.Arrays;
	
	class Solution {
	    public String solution(String[] seoul) {
	        String answer = "";
	        
	        // 배열의 인덱스를 찾아 반환
	        // 방법 1. Arrays의 라이브러리 사용
	        // int i = Arrays.asList(seoul).indexOf("Kim");
	        
	        // 반복문을 통해 index 하나씩 탐색하여 "Kim"을 찾기
	        for(int i = 0; i < seoul.length; i++) {
	            if(seoul[i].equals("Kim")) {
	                answer = "김서방은 " + i + "에 있다";
	            }
	        }
	        return answer;
	    }
	}
	
}
