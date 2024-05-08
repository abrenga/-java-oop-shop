package org.lessons.java.shop;

import java.util.Random;

public class Prodotto {
	private String codiceProdotto;
	private String nome;
	private String descrizione;
	private float prezzoConIva;

	public Prodotto(String codice, String nome, String descrizione, float prezzoConIva) {
		this.codiceProdotto = codice;
		this.nome = nome;
		this.descrizione = descrizione;
		this.prezzoConIva = prezzoConIva;

	}

	public String getCodiceProdotto() {
		return codiceProdotto;
	}

	public float getPrezzoConIva() {
		return prezzoConIva;
	}

	public String getNome() {
		return nome;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setPrezzoConIva(float prezzoConIva) {
		this.prezzoConIva = prezzoConIva;
	}

	public String toString() {
		String string = this.codiceProdotto + " " + this.nome + " " + this.descrizione + " " + this.prezzoConIva;
		return string;
	}

	public static String generaCodiceProdotto() {
		/*
		 * public static String leftPad(final String str, final int size, final char
		 * padChar) { if (str == null) { return null; } final int pads = size -
		 * str.length(); if (pads <= 0) { return str; // returns original String when
		 * possible } if (pads > PAD_LIMIT) { return leftPad(str, size,
		 * String.valueOf(padChar)); } return repeat(padChar, pads).concat(str); }
		 */
		Random random = new Random();
		// genera numero casuale tra 0 e 8
		int number = random.nextInt(100);// qui non sono sicura vada bene
		String str = Integer.toString(number);

		/*
		for (int i = 0; i < str.length(); i++) {
			if(str.length()<8) {
				str="0"+str;
			}
		}*/
		
		
		int riempiConLoZero = 8 - str.length();
		for (int i = 0; i < riempiConLoZero; i++) {
			str = "0" + str;
		}
		
		return str;

	}

	public float calcolaPrezzoBase() {
		float iva = (this.prezzoConIva / 100) * 2;
		float prezzoBase = this.prezzoConIva - iva;
		return prezzoBase;
	}

	public String nomeInt() {
		String nomeIntero = getCodiceProdotto() + this.nome;
		return nomeIntero;
	}

}
