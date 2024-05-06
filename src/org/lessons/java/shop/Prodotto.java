package org.lessons.java.shop;

import java.util.Random;

public class Prodotto {
	private long codiceProdotto;
	private String nome;
	private String descrizione;
	private float prezzoConIva;

	public Prodotto(long codice, String nome, String descrizione, float prezzoConIva) {
		this.codiceProdotto = codice;
		this.nome = nome;
		this.descrizione = descrizione;
		this.prezzoConIva = prezzoConIva;

	}

	public long getCodiceProdotto() {
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
		String string=  this.codiceProdotto+" " + this.nome+" " + this.descrizione+" " + this.prezzoConIva;
		 return string;
	}

	public static long generaCodiceProdotto() {
		Random random = new Random();
		// genera numero casuale tra 0 e 8
		int number = random.nextInt(100000000);//qui non sono sicura vada bene
		return number;
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
