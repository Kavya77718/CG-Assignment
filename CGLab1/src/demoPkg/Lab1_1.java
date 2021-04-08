package demoPkg;

public class Lab1_1 {
	int calculateSum(int n) {
		int sum =0;
		for(int i = 0; i<=n; i++) {
			if(i%3 == 0 || i%5 == 0) {
				 sum = sum + i;
			}
			
		}
		return sum;
		
	}

	public static void main(String[] args) {
		Lab1_1 lb = new Lab1_1();
		System.out.println(lb.calculateSum(15));

	}

}
