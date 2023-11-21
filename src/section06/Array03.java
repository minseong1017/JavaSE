package section06;

public class Array03 {
	public static void main(String[] args) {
		//new 연산자 사용하지 않고 직접 배열 생성 및 값 대입하기
		String[] pokemon = {"피카츄", "라이츄", "파이리", "꼬부기", "버터플", "야도란"};
		System.out.println(pokemon[2]);
		
		for(int i=0; i<pokemon.length; i++) {
			System.out.println(pokemon[i]);
		}
		System.out.println("============================");
		pokemon[3] = "잠만보";
		for(int i=0; i<pokemon.length; i++) {
			System.out.println(pokemon[i]);
		}
		//향상된 for문, 확장 for문
		for(String mon : pokemon) {
			//String mon = pokemon[0]
			//String mon = pokemon[1]
			//String mon = pokemon[2]
			//String mon = pokemon[3]
			//String mon = pokemon[4]
			//String mon = pokemon[5]
			System.out.println(mon);
		}
	}
}
