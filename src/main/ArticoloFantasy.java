package main;

import java.util.Date;

public class ArticoloFantasy extends Articolo {
	
	private String descrizione;

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}
	
	public ArticoloFantasy(int id, String titolo, Date data, String testo, String string, Tags tags) {
		super(id, titolo, data, "Fantasy Blog", testo, null, tags);
		this.setDescrizione("caratterizzato da elementi, creature ed eventi fantastici, ambientato in un luogo spesso immaginario, "
				+ "talvolta non ben definito; narra spesso della lotta tra bene e male e generalmente, dopo numerose vicende, "
				+ "è il bene a trionfare.");
	}
	
}
