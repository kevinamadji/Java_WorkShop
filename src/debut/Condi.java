package debut;

import java.util.Scanner;

public class Condi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Saisir une note puis donner la mention au BAC 
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Bienvenu dans le mini test \n");
		System.out.println("Veillez saisir la note \n");
		int note = sc.nextInt();
		if(note < 10 ) {
			System.out.println("Vous n'avez pas la moyenne");
		}
		else if(note >=10 && note <12 ) {
			System.out.println("Vous avez la mention Passable");
		}
		else if(note >=12 && note <14 ) {
			System.out.println("Vous avez la mention Assez-bien");
		}
		else if(note >=14 && note <16 ) {
			System.out.println("Vous avez la mention Bien");
		}
		else if(note >=16 && note <18 ) {
			System.out.println("Vous avez la mention Très-Bien");
		}
		else if(note >=18 && note <20 ) {
			System.out.println("Vous avez la mention EXCELLENTE !!!  BRAVO");
		}
		
	}

}
