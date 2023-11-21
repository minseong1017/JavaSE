package section04;
/*
 * 제어문
 * 	프로그램 실행 흐름을 제어하기 위해 사용되는 명령어
 * 
 * 조건문
 * 	조건식에 따라서 프로그램의 흐름을 제어할 수 있는 명령어
 * 
 * 1. if문
 * 	if(조건식) {
 * 		조건식이 true일 때 실행명령어
 * }
 * 
 * if(조건식)
 * 		조건식 true일 때 실행명령어(명령어 하나일경우 중괄호 생략가능)
 * 
 */
public class conditiona101 {
	public static void main(String[] args) {
		int num = 38;
		
		if(num %2 == 0) {
			System.out.println("num은 짝수입니다.");
		}
		
		if(num %2 != 0) {
			System.out.println("num은 홀수입니다.");
		}
		if(num %2 == 0) 
			System.out.println("num은 짝수입니다.");
		
		
		if(num %2 != 0) 
			System.out.println("num은 홀수입니다.");
		
	}
}
