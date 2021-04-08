package demoPkg;

public class FibonacciSeries {

	public static void main(String[] args) {
		int n0 = 1, n1= 1, n=10,n2;
		System.out.print(n0+" "+n1);
		for(int i = 2; i< n; ++i) {
			n2 = n0 + n1;
			System.out.print(" "+n2);
			n0 = n1;
			n1 = n2;
					
		}

	}

}
