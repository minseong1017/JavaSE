package section03;
/*
 * 2. 증감 연산자
 * ++ : 1씩 증가시킨다.
 * -- : 1씩 감소시킨다.
 * 
 * 
 * 
 */
public class Operator02 {
	public static void main(String[] args) {
		int num = 0;
		num = num+1;
		System.out.println(num); // 1
	
		num++;
		System.out.println(num); // 2
		
		//전위 증감 연산자 - print 명령어 실행전 1증가
		System.out.println(++num); // 3
		//후위 증감 연산자 - print 명령어 실행 후 1증가
		System.out.println(num++); // 3
		System.out.println(num); // 4
		System.out.println(--num); //3
		System.out.println(num--); //3
		System.out.println(num); //2
		

	}
}
