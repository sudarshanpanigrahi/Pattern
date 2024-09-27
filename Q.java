package pattern;

public class Q {

	public static void main(String[] args) {
		int n=10;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if ((i==0 && j<=n/2) || (j == 0 && i<=n/2) || 
						(i==n/2&& j<=n/2 ) || (j==n/2 && i<=n/2) || 
						(i==j && i>=3 && j<=n-3) )
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
}
