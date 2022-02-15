/**
* ABOUT
*
* DATE: 2022-02-15
* AUTHOR: dms873
*
* URL: https://programmers.co.kr/learn/courses/30/lessons/12919?language=javascript
*
* COMMENT:
* for문을 사용해 Kim 단어 찾기
**/

function solution(seoul) {
    var answer = '';
    for(let i = 0; i < seoul.length; i++) {
        if(seoul[i] === 'Kim') {
            answer = "김서방은 " + i + "에 있다"
        }
    }
    return answer;
}
