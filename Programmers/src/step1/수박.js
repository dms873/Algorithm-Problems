/**
* ABOUT
*
* DATE: 2022-02-16
* AUTHOR: dms873
*
* URL: https://programmers.co.kr/learn/courses/30/lessons/12922?language=javascript
*
* COMMENT:
* for문을 이용하여 i가 짝수면 '박' 아니면 '수'를 리턴
**/

function solution(n) {
    var answer = '';
    for(let i = 1; i <= n; i++) {
        if(i % 2 === 0) {
            answer += '박'
        } else {
            answer += '수'
        }
    }
    return answer;
}
