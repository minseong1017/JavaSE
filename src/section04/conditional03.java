package section04;
/*
 * 1-3 if ~ else if ~ else 문
 * 	if(조건식1){
 * 		조건식1이 true일 경우 실행되는 명령어 
 * } else if(조건식 2){
 * 		조건식 2가 true일 경우 실행되는 명령어
 * }else{
 * 		조건식 1, 2 모두 false일 때 실행되는 명령어
 * } 
 */
public class conditional03 {
	public static void main(String[] args) {
		int num = 100;
		
		if(num %3 == 0) {
			System.out.println("num %3 == 0");
		}else if (num %3 == 1) {
			System.out.println("num %3 == 1");
		}else if(num %3 == 2) {
			System.out.println("num %3 == 2");
		}else {
			System.out.println("num은 정수가 아닙니다.");
		}
	}
}
