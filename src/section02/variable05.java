package section02;

import java.math.BigDecimal;

/*
 * 데이터 표현방식
 * 	정수표현
 * 		컴퓨터는 2진수로 표현(bit)
 *		부호비트(Most Significant Bit) + 수치비트
 *		음의 값을 표현할때 2의 보수로 표현
 *
 *	실수 표현 (부동소수점 표현)
 * 		지수부(e) 비트 + 가수부(m) 비트
 * 	실수표현 수식
 * 		±(1.m)*2^(e-127) - 32비트 
 * 부동소수점 오차
 * 		컴퓨터가 실수표현 정확하게 불가능
 * 		근사치값으로 표현함에 따라 생기는 오차
 * 		
 */
public class variable05 {
	public static void main(String[] args) {
		
		float f = 0.0f;
		double d = 0.0d;
		BigDecimal bd = BigDecimal.valueOf(0.0);
		for(int i=0; i<100; i++) {
			f +=0.1f; // f= f+0.1f;
			d +=0.1d;
			bd = bd.add(BigDecimal.valueOf(0.1));
		}
		
		System.out.println(f);
		System.out.println(d);
		System.out.println(bd);
		
	}
}
