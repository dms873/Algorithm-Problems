/**
	* ABOUT
	*
	* DATE: 2022-02-14
	* AUTHOR: dms873
	*
	* URL: https://programmers.co.kr/learn/courses/30/lessons/12969?language=javascript
	*
	* COMMENT:
	* for 문을 이용하여 별찍기
	**/

process.stdin.setEncoding('utf8');
process.stdin.on('data', data => {
    const n = data.split(" ");
    const a = Number(n[0]), b = Number(n[1]);
    for(let i = 0; i < b; i++) {
    console.log('*'.repeat(a));    
    }

});
