package main;

import java.util.Scanner;
import java.util.Date;

public class Main {

	public static void main(String[] args) {

		Autore aut1 = new Autore(1, "Carlo", "Oriani");
		Autore aut2 = new Autore(2, "Luciana", "Napolitano");
		
		Articolo articolo1 = new ArticoloFantasy(0, "Lorem ipsum dolor sit amet, consectetur adipiscing elit.", null,
				"Lorem ipsum " + "dolor sit amet, consectetur adipiscing elit.",
				"Lorem ipsum dolor sit amet, consectetur adipiscing elit."
						+ "Lorem ipsum dolor sit amet, consectetur adipiscing elit.",
				new Tags(new String[] { "gioia", "felicità" }));
		Articolo articolo2 = new ArticoloFantasy(0, "Lorem ipsum dolor sit amet, consectetur adipiscing elit.", null,
				"Lorem ipsum " + "dolor sit amet, consectetur adipiscing elit.",
				"Lorem ipsum dolor sit amet, consectetur adipiscing elit."
						+ "Lorem ipsum dolor sit amet, consectetur adipiscing elit.",
				new Tags(new String[] { "noia", "solitudine" }));
		Articolo articolo3 = new ArticoloFantasy(0, "Lorem ipsum dolor sit amet, consectetur adipiscing elit.", null,
				"Lorem ipsum " + "dolor sit amet, consectetur adipiscing elit.",
				"Lorem ipsum dolor sit amet, consectetur adipiscing elit."
						+ "Lorem ipsum dolor sit amet, consectetur adipiscing elit.",
				new Tags(new String[] { "mare", "sole" }));
		Articolo articolo4 = new ArticoloFantasy(0, "Lorem ipsum dolor sit amet, consectetur adipiscing elit.", null,
				"Lorem ipsum " + "dolor sit amet, consectetur adipiscing elit.",
				"Lorem ipsum dolor sit amet, consectetur adipiscing elit."
						+ "Lorem ipsum dolor sit amet, consectetur adipiscing elit.",
				new Tags(new String[] { "nuvole", "campagna" }));
		
		aut1.scriviArticolo(articolo1);
		aut1.scriviArticolo(articolo3);
		aut2.scriviArticolo(articolo2);
		aut2.scriviArticolo(articolo4);

		
		Articolo[] articoli = {articolo1,articolo2,articolo3,articolo4};
		
		Blogimp Blog = new Blogimp(articoli);
		
		System.out.println("Ci sono " + Blog.getArticoli().length + " articoli nel tuo Blog.");

		Scanner scanner = new Scanner(System.in);
		if(Blog.getArticoli().length !=0) {
			//setto una variabile di default
			int A = 0;
			do {
				System.out.println("Scegliere il numero dell'opzione da lei preferita:\n1.Stampa tutti gli articoli"
						+ "\n2.Scegli l'id del tuo articolo\n3.Magari un aaltra volta");
				A = Integer.parseInt(scanner.nextLine());
				if(A==1) {
					System.out.println(Blog.stampaArticoli());
				}else if(A==2) {
					System.out.println("Inserire l'Idd ell'articolo:");
					int id = Integer.parseInt(scanner.nextLine());
					do {
						if(!idCheck(id, Blog)) {
							System.out.println("Non viene trovato nessun articolo con l'id selezionato.");
							break;
						}else {
							System.out.println(Blog.stampaArticoloPerId(id));
						}
					}while(!idCheck(id,Blog));
				}
			}while(A != 1 && A !=2 && A != 3);
		}else {
			System.out.println("Non ho trovato articoli");
		}
		
		
		
		
	}

	private static boolean idCheck(int id, Blogimp blog) {
		boolean check = false;
		for(int i=0;i<blog.getArticoli().length && !check; i++) {
			if(blog.getArticoli()[i].getId()==id) {
				check=true;
			}
		}
		return check;
	}

}
