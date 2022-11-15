package personnages;

public class Yakuza extends Humain{
	private int reputation;
	private String nomDeClan;
	
	public Yakuza(String nom, int argent, int reputation, String nomDeClan) {
		super(nom, "whisky",argent);
		this.reputation = reputation;
		this.nomDeClan = nomDeClan;
		}
	
	public int getreputation() {
		return reputation;
	}
	public String nomDeClan(String nomDeC) {
		return nomDeClan;
	}
	
	public void extorquer(Commercant victime) {
		int racket = victime.seFaireExtorquer();
		parler("Tiens, tiens, ne serait-ce pas un faible marchand qui passe par la ?");
		parler(victime.getNom() +", si tu tiens a la vie donne moi ta bourse !");
		this.gagnerArgent(racket);
		parler("J ai pique les "+ racket +" sous de"+ victime.getNom() +" , ce qui me fait "+ getArgent() +"sous dans ma poche. HI ! HI!");
	}
}
