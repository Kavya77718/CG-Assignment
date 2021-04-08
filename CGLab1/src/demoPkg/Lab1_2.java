package demoPkg;

public class Lab1_2 {
	int calculateDifference(int n) { 
	int sum =0, squares = 0, ans;
	for(int i = 1; i<=n; i++) {
		squares = squares + (i*i); 
		sum = sum + i;
	}
	ans = squares - (sum * sum);
	return ans;
	
		
	}
	

	public static void main(String[] args) {
		Lab1_2 lb = new Lab1_2();
		System.out.println(lb.calculateDifference(3));

	}

}
