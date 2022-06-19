package main;

import java.text.DateFormat;
import java.util.Locale;

public class Blogimp implements Blog {
	private Articolo[] Articoli;

	public Blogimp() {
	}

	public Articolo[] getArticoli() {
		return Articoli;
	}

	public Blogimp(Articolo[] articoli) {
		Articoli = articoli;
	}

	public void Articoli(Articolo[] articoli) {
		this.Articoli = articoli;
		// assegno l'Id ad ogni elemento dell'array
		for (int i = 0; i < articoli.length; i++) {
			articoli[i].setId(i + 1);
		}
	}

	@Override
	public String stampaArticoloPerId(int id) {
		// inizializzo una variabili a false
		boolean check = false;
		//messagio default
		String risposta = "Non ci sono articoli con l'id richiesto";
		// SE l'array non è vuoto
		if (Articoli != null) {
			// DateFormat per settarmi il formato di data che preferisco
			DateFormat giorno = DateFormat.getDateInstance(DateFormat.SHORT, Locale.ITALIAN);
			// trovo l'id che passo in input
			for (int i = 0; i < Articoli.length || !check; i++) {
			//costruisco la stringa che andrò a consegnare
			if (Articoli[i].getId() == id) {
				risposta = "Articolo id: " + id + "Titolo: " + Articoli[i].getTitolo() + "Data ins.: "
						+ giorno.format(Articoli[i].getData()) + "Categoria: " + Articoli[i].getCategoria() + "Testo: "
						+ Articoli[i].getTesto() + "Autore: " + Articoli[i].getAutore() + "Tags: "
						+ Articoli[i].getTags();
				if (Articoli[i] instanceof ArticoloFantasy) {
					risposta +="Descrizione: " + ((ArticoloFantasy)Articoli[i]).getDescrizione();
				}else if (Articoli[i] instanceof ArticoloNoir) {
					risposta += "Descrizione: " + ((ArticoloNoir)Articoli[i]).getDescrizione();
				}else {
					risposta += " ";
				}check=true;
			}
			}
		}
		return risposta;
	}

	@Override
	public String stampaArticoli() {
		String risposta = "";
		if(Articoli != null) {
			DateFormat giorno = DateFormat.getDateInstance(DateFormat.SHORT, Locale.ITALIAN);
			for(int i = 0; i<Articoli.length;i++) {
				risposta = "Articolo id: " + Articoli[i].getId() + "Titolo: " + Articoli[i].getTitolo() + "Data ins.: "
						+ giorno.format(Articoli[i].getData()) + "Categoria: " + Articoli[i].getCategoria() + "Testo: "
						+ Articoli[i].getTesto() + "Autore: " + Articoli[i].getAutore() + "Tags: "
						+ Articoli[i].getTags();
				if(Articoli[i] instanceof ArticoloFantasy) {
					risposta += "Descrizione: " + ((ArticoloFantasy)Articoli[i]).getDescrizione();
				}else if(Articoli[i]instanceof ArticoloNoir) {
					risposta += "DEscrizione: " + ((ArticoloNoir)Articoli[i]).getDescrizione();
				}else {
					risposta += "";
				}
				
			}
		}
		return risposta;
	};

}
