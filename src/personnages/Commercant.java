package personnages;

public class Commercant extends Humain {
	
	public Commercant(String nom, int argent) {
		super(nom, "the", argent);
	}	
	
	public int seFaireExtorquer() {
		int racket = this.getArgent();
		this.perdreArgent(racket);
		this.parler("J’ai tout perdu! Le monde est trop injuste...");
		return racket;
	}
	public void recevoir(int argent) {
		System.out.println(argent + " sous ! Je te remercie généreux donateur! ");
	}
}
