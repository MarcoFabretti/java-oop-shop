package it.shop;
import java.util.*;
public class main {

	public static void main(String[] args) {
		Scanner cIn = new Scanner(System. in);
		System.out.println("Inserire nome e descrizione del prodotto");
		System.out.print("nome: ");
		String nome = cIn.nextLine();
		System.out.print("descrizione: ");
		String descrizione = cIn.nextLine();
		Prodotto x=new Prodotto(nome, descrizione);
		System.out.println(x.getCodice()+" "+x.getNome() +" "+ x.getDescrizione() + " " + x.getPrezzo() + " ");
		x.stampaPI();
		x.stampaNome();
		cIn.close();
	}

}
