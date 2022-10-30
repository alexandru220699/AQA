package hereisthexercise;

import java.util.Scanner;

public class Fortech {

	public static void main(String[] args) {
		System.out.println("Muscalu Alexandru - 22.06.1999");
		Scanner in = new Scanner(System.in);
		
		System.out.print("Introduceti un numar: ");
		int numarul1 = in.nextInt();
		
		System.out.print("Introduceti al doilea numar: ");
		int numarul2 = in.nextInt();
		
		System.out.print(numarul1 + " x " + numarul2 + " = " + (numarul1 * numarul2));
		
		in.close();

	}

}
