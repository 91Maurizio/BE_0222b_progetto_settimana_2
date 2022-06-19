package main;

import java.util.Date;

public class ArticoloNoir extends Articolo {
	
	private String descrizione;

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}
	
	public ArticoloNoir(int id, String titolo, Date data, String testo, Tags tags) {
		super(id, titolo, data, "Blog Noir", testo, null, tags);
		this.setDescrizione("letterario poliziesco, e più specificamente del sottogenere hard boiled,"
				+ " nato negli Stati Uniti alla fine degli anni venti del XX secolo.");
	}
	
}
