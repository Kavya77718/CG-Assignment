package demoPkg;
import java.util.Scanner;
public class PrimeNumbers {
    
	public int primeNum(int n) {
		int count=0;
		for(int j=2;j<=n;j++)
		{
		count=0;
		for(int i=1;i<=j;i++)
		{
		   if(j%i==0)
		   {
		        count++;        
		   }
		}
		if(count==2)
		       System.out.print(j+"  ");     
		}
		return 0;
	}
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	PrimeNumbers p=new PrimeNumbers();
	p.primeNum(n);
	sc.close();

}
}
