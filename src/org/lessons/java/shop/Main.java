package org.lessons.java.shop;

import java.util.Scanner;

public class Main {
	public static void main(String[] arg) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("nome prodotto");
		String nome = scanner.nextLine();
		
		System.out.println("descrizione");
		String descrizione = scanner.nextLine();

		System.out.println("prezzo");
		String prezzoConIva = scanner.nextLine();
		float val = Float.parseFloat(prezzoConIva);
		
		
		long codiceProdotto = Prodotto.generaCodiceProdotto();
		
		Prodotto prodotto = new Prodotto(codiceProdotto, nome, descrizione, val);
		
		System.out.println(prodotto);
		
		

	}
}
