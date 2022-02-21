/**
	* ABOUT
	*
	* DATE: 2022-02-21
	* AUTHOR: dms873
	*
	* URL: https://programmers.co.kr/learn/courses/30/lessons/12903
	*
	* COMMENT: s의 전체길이를 2로 나누고 짝수 혹은 홀수인 경우로 나누어 처리한다.
	* 
	**/
  
  class Solution {
    public String solution(String s) {
        String answer = "";
        
        // 짝수면 2글자 출력
        // 홀수면 1글자 출력
        if(s.length() % 2 == 0) {
            answer = s.substring(s.length() / 2 - 1, s.length() / 2 + 1);
        } else {
            answer = s.substring(s.length() / 2, s.length() / 2 + 1);
        }
        
        return answer;
    }
}
