package debut;

import java.util.Scanner;

public class Boucle {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Saisir un nombre");
		int n = sc.nextInt();
		int f = 1;
		int i = 1;
		while (i <= n) {
			f = f * i;
			i++;
		}
		System.out.println("Le factorielle de " + n + " est égale à "+ f);
		
	}

}
