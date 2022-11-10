package alt;

import java.util.Scanner;

public class MediaAlt {

	public static void main(String[] args) {
		double h1, h2, h3, m;
		
		Scanner enter = new Scanner(System.in);
		
		h1 = enter.nextDouble();
		h2 = enter.nextDouble();
		h3 = enter.nextDouble();
		
		m = (h1 + h2 + h3) / 3;
		
		System.out.println("A media aritmetica das 3 alturas eh: " + m + ".");
	}
}
