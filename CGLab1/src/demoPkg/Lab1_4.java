package demoPkg;

import java.util.Scanner;

public class Lab1_4 {

	 public static void main(String[] args) {

		    Scanner in = new Scanner(System.in);
		    int number = in.nextInt();
		    in.close();

		    if (checkNumber(number)) {
		      System.out.println("yes");
		    } else {
		      System.out.printf("no");
		    }
		  }

		  private static boolean checkNumber (int number) {

		    if (number % 2 != 0) {
		      return false;
		    } else {

		      for (int i = 0; i <= number; i++) {

		        if (Math.pow(2, i) == number) return true;
		      }
		    }
		    return false;
		  }
		}

