package demoPkg;

public class SumOfCubes {

	int getCubeSum(int n) {
		int n1, ans = 0;
		while (n != 0) {
			n1 = n % 10;
			ans = ans + (n1 * n1 * n1);
			n = n / 10;

		}
		return ans;
	}

	public static void main(String[] args) {

		SumOfCubes gc = new SumOfCubes();
		System.out.println(gc.getCubeSum(123));
	}

}
