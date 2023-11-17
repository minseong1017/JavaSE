package section03;
/*
 * 4. 논리연산자
 * 	&& : And 조건, 교집합 개념, 두 항 모두 true 일때 true
 * 	|| : Or 조건, 합집합 개념, 두 항 중 하나 이상 true 일 때 true
 * 	!  : Not 조건, 여집합 개념, 논리(boolean) 값 반전 시킨다.
 * 
 * 
 */
public class Operator04 {
	public static void main(String[] args) {
		boolean result = true && false;
		System.out.println("result : "+ !result);
		boolean result2 = true || false;
		System.out.println("result : "+result2);
		boolean result3 = !true;
		System.out.println("result : "+result3);
		int age = 28;
		String gender = "Male";
		if(age >= 19 && gender == "Male") {
			System.out.println("성인 남성입니다.");
		}
		String brand = "LG전자";
		if(brand == "LG전자" || brand == "LG생활건강" || brand =="LGU+") {
			System.out.println("LG우승 기념 29% 할인 행사 중입니다.");
		}else {
			System.out.println("브랜드 미적용입니다.");
		}
		boolean result4 = true && true && true || false;
		System.out.println("result4 : " + result4);
		
	}
}
