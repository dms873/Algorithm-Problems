 /**
	* ABOUT
	*
	* DATE: 2022-02-23
	* AUTHOR: dms873
	*
	* URL: https://programmers.co.kr/learn/courses/30/lessons/12937
	*
	* COMMENT: if문을 사용하여 짝수, 홀수일 경우를 처리한다.
	* 
	**/
  
  function solution(num) {
    var answer = '';
    if(num % 2 === 0) {
        answer="Even"
    } else {
        answer="Odd"
    }
    return answer;
}
