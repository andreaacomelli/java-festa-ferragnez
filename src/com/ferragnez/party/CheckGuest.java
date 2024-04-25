package com.ferragnez.party;

import java.util.Scanner;

public class CheckGuest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] guests = {"Dua Lipa", "Paris Hilton", "Manuel Agnelli", "J-Ax", "Francesco Totti", "Ilary Blasi", "Bebe Vio", "Luis", "Pardis Zarei", "Martina Maccherone", "Rachel Zeilic"};
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Inserisci il tuo nome ");
		
		String nome = scan.nextLine();
		
		for(int i = 0; i < guests.length; i++) {
			String currentName = guests[i];
			
			if(nome.equals(currentName)) {
				System.out.println("Sei Ammesso");
				break;
			}
			if (!nome.equals(currentName)) {
			      System.out.println("Non Sei Ammesso");
			      break;
			    }
		}
		scan.close();
	}
}