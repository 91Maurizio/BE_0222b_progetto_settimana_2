package main;

public interface Scrittore {
	
	public Articolo scriviArticolo(String titolo, String Categoria, String testo, Tags tags);
	
	public Articolo scriviArticolo(Articolo articolo);

}
