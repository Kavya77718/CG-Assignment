package demoPkg;
import java.util.Scanner;

public class TrafficLight {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String singal=s.nextLine();
		s.close();
		switch(singal) {
			case "red":
				System.out.println("Stop");
				break;
			case "yellow":
				System.out.println("ready");
				break;
			case "green":
				System.out.println("Go");
				break;
			default:
					System.out.print("NA");
			}
	}
	

}
