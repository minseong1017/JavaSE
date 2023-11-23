package homework;

public class gugudan {
	public static void main(String[] args) {

		for(int i = 1; i<10; i= i+3) {
			for(int j = 1; j<10; j++) {
				for(int k = 0; k<3; k++) {
					if(k !=2) {
						System.out.printf("%d x %d = %d \t", i+k, j, (i+k)*j );
					}
					else {
						System.out.printf("%d x %d = %d \n", i+k, j, (i+k)*j);
					}
				}
			}
			System.out.println("\n");
		}
	}
}
