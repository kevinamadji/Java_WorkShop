package debut;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		//System.out.println("Bonjour je m'appelle Kevin ");
		
		/*int age = 26;
		String nom = "AMADJI";
		String prenom = "Kevin";
		String entreprise = "JM Bruneau";
		
		System.out.println(nom +  " "+ prenom +  " a " + age + ".\n"
		+ "Il travail chez " + entreprise + " qui est une boîte de E-commerce" + ".\n");*/
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Saisir le nombre d'enfant que vous avez \n");
		int nb_child = sc.nextInt();
		switch (nb_child) {
		case 1:
			System.out.println("Votre prime est de 150 euros");
			break;
		case 2:
			System.out.println("Votre prime est de 300 euros");
			break;
		case 3:
			System.out.println("Votre prime est de 450 euros");
			break;
			
		default:
			System.out.println("Vous ne pouvez pas bénéficier de la prime pour enfant");
			
	
		
		}
		
		
		
		
	}

}
