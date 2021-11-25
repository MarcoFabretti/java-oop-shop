package it.shop;

import java.util.Random;

public class Prodotto {
	int codice;
	private String nome;
	private String descrizione;
	private float prezzo;
	private float iva = (float) 0.22;

	Prodotto() {
		codice = genCodice();
		nome = " ";
		descrizione = " ";
		prezzo = 0;
	}

	Prodotto(String nome, String descrizione) {
		this.codice = genCodice();
		this.nome = nome;
		this.descrizione = descrizione;
		this.prezzo = genPrezzo();
	}

	public int getCodice() {
		return codice;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public float getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(float prezzo) {
		this.prezzo = prezzo;
	}

	public float getIva() {
		return iva;
	}

	public void setIva(float iva) {
		this.iva = iva;
	}

	private int genCodice() {
		Random r = new Random();
		int id = r.nextInt(9999);
		return id;
	}

	public void stampaPI() {
		float prezzoI = getPrezzo() + (getPrezzo() * getIva());
		System.out.println("il prezzo iva inclusa ammonta: " + prezzoI);
	}

	public void stampaNome() {
		System.out.println("il codice-nome prodotto è: " + getCodice() + "-" + getNome());
	}

	private float genPrezzo() {
		Random r = new Random();
		float prezzo = r.nextFloat(9999);
		return prezzo;
	}
}

