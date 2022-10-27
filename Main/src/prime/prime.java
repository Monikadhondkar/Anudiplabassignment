package prime;
import java.util.Scanner;

public class prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	    int a, b, flag = 0, i, j;

	    Scanner scanner = new Scanner(System.in);

	    System.out.print("\nEnter the lower bound : ");
	    a = scanner.nextInt();
	    System.out.print("\nEnter the upper bound : ");
	    b = scanner.nextInt();
	    System.out.println("The prime numbers in between the entered limits are :");

	    int x = 0;
	    for (i = a; i <= b; i++) {
	      for (j = 2; j < i; j++) {
	        if (i % j == 0) {
	          flag = 0;
	          break;
	        } else {
	          flag = 1;
	    }
    }
    if (flag == 1) {
      x++;
      System.out.println(i + " ");
    }
  }
	    }
	}
		


