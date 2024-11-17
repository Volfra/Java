package xtest;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		while (true) {
			try {
				int a = Integer.parseInt(s.nextLine());
				Funcion f = new Funcion();
				f.facto(a);
			} catch (NumberFormatException e) {
				System.out.println("método main digito mal " + e);
			} catch (ArithmeticException e) {
				System.out.println("metodo facto " + e);
			}
		}
	}

}
