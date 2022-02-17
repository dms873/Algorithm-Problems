	/**
	* ABOUT
	*
	* DATE: 2022-02-17
	* AUTHOR: dms873
	*
	* URL: https://programmers.co.kr/learn/courses/30/lessons/12922
	*
	* COMMENT: for문을 이용해 반복하여 짝수면 수, 홀수면 박을 answer에 담기
	* 
	**/

class Solution {
    public String solution(int n) {
        String answer = "";
        
        for(int i = 0; i < n; i++) {
            // n이 1이면 "수"
            // n이 2이면 "수박"
            if(i % 2 == 0) {
                answer += "수";
            }
            if(i % 2 == 1) {
                answer += "박";
            }
                
        }
        
        return answer;
    }
}
