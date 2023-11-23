package homework;

public class star3 {
	 public static void main(String[] args) {
	int n = 4;
	int m = 2*n-1;
	for(int i=0; i<m; i++) {
		if(i<=n) {
		for(int j=1; j<n-i; j++ ) {
			System.out.print(" ");
		}
		for(int k=0; k<=i*2; k++) {
			System.out.print("*");
		}
		System.out.print("\n");
		}
		else {
			for(int j=n-i; j>1; j-- ) {
				System.out.print(" ");
			}
			for(int k=0; k<=i*2; k++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
			
		}
	}
}
