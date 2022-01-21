package step3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class SpeedAplusB {
	
	/**
	 * ABOUT
	 *
	 * DATE: 2022-01-22
	 * AUTHOR: dms873
	 *
	 * URL: https://www.acmicpc.net/problem/15552
	 *
	 * COMMENT:
	 * 빠른 입출력을 위해 BufferedReader와 BufferedWriter을 사용함.
	 **/
	
	
	// 메소드 선언부에 throws를 명시하면 해당 메소드 내에서 exception이 발생하는 경우 
	// 해당 메소드를 호출한 곳에서 예외가 발생한다.
	public static void main(String[] args) throws IOException {
		// 문자열 입력 받을 BufferedReader, BufferedWriter 선언
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// String형으로 입력받은 문자열숫자를 Integer로 형변환 해준 후 int형 변수 T에 담아준다.(자동형변환)
		int T = Integer.parseInt(br.readLine());
		
		
		for(int i = 0; i < T; i++) {
			// 해당 줄 전체를 String으로 입력 받는다.
			String s = br.readLine();
			// 띄어쓰기로 구분하여 형변환을 한 후
			int a = Integer.parseInt(s.split(" ")[0]);
			int b = Integer.parseInt(s.split(" ")[1]);
			// bw.write()에 덧셈을 수행하는 것을 넣어준다.
			bw.write(a+b+"\n"); // 버퍼에 쓰는 것, 화면에 출력 되는 건 X
		}
		br.close();
		
		// 버퍼를 비운 뒤 닫아준다.
		bw.flush(); // 화면에 출력하는 역할
		bw.close();
	}
}
