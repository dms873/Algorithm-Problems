/**
	* ABOUT
	*
	* DATE: 2022-02-20
	* AUTHOR: dms873
	*
	* URL: https://programmers.co.kr/learn/courses/30/lessons/12903
	*
	* COMMENT: s의 전체길이를 2로 나누고 짝수 혹은 홀수인 경우로 나누어 처리한다.
	* 
	**/
  
  function solution(s) {
    var answer = '';
    let mid = Math.floor(s.length/2) 
        if(s.length % 2 === 1) {
            answer = s.substring(mid, mid+1);
        } else {
            answer = s.substring(mid-1, mid+1);
        }
    return answer;
}
