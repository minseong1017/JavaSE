package homework;

public class star2 {
	public static void main(String[] args) {
		 
		int n = 4;
		for(int i=0; i<n; i++) {
			for(int j=1; j<n-i; j++ ) {
				System.out.print(" ");
			}
			for(int k=0; k<=i*2; k++) {
				System.out.print("*");
			}
			System.out.print("\n");
			}
		}
	}

