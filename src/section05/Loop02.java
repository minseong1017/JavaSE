package section05;
/*
 * 2, do ~ while 문
 * 	while문과 비슷하지만, 조건에 상관없이 최초 한 번은 무조건실행된다.
 * 
 * 
 */
public class Loop02 {
	public static void main(String[] args) {
		int count = 101;
		
		do {
			System.out.println(count);
			count ++;
		}while (count <= 100);
	}
}
