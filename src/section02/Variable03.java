package section02;
/*
 * 3. 정수형
 * 	byte 	(1byte) : -128 ~ +127
 * 	short	(2byte)	: -32,768 ~ 32,767
 * 	int		(4byte)	: -2,147,483,648 ~ 2,147,483,647
 * 	long	(8byte) : -9,223,372,036,854,775,808 ~ 9,223,372,036,854,775,807
 */
public class Variable03 {
	public static void main(String[] args) {
		
		byte num1 = 20;
		short num2 = 30;
		int num3 = 40;
		long num4 = 50;
		//ctrl alt 방향키 = 줄복사
		//ctrl s = 저장
		// ctrl shift s 모든파일 저장
		// ctrl shift l 단축키 링크
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		System.out.println(num4);
	
		num1 += 108;
		System.out.println(num1);
		
		num3 += 2147483608;
		System.out.println(num3);
	}
}
