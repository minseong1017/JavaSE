package section01;
/*
 * 주석
 * 	코드에 영향을 주지 않는 개발자가 사용하는 메모 공간
 * ㅇㅅㅇ
 * 여러 줄 주석
 */

public class Comment {
	public static void main(String[] args) {
		// 한줄 주석
		// 한줄주석 단축키 - ctrl + /
		System.out.println("Hello, Java!");
		area(10); // area 메서드 호출
		area(25);
		area(22);
		area(1);
	}
	/** JavaDoc 주석
	 * 원의 넓이를 구하는 메서드
	 * 
	 * @param r - 반지름
	 */
	public static void area(int r) {
		// 원의 넓이
		double area = Math.PI * Math.pow(r,  2);
		System.out.println("반지름이" + r + "인원의 넓이 : " + area);
	}
}
