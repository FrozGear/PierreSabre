package personnages;

public class Humain {
	private String nom;
	private String boissonFav;
	private int argent;

	public Humain(String nom, String boissonFav, int argent) {
		this.nom = nom;
		this.boissonFav = boissonFav;
		this.argent = argent;		
	}
	
//--------------------------------------------------------------------------------------------	
	public String getNom() {
		return nom;
	}
	public int getArgent(){
		return argent;
	}
	
//---------------------------------------------------------------------------------------------	
	public void parler(String texte) {
		System.out.println(texte);
	}
	public void direBonjour() {
		parler("Bonjour ! Je m�appelle "+ this.nom +" et j�aime boire du "+ this.boissonFav+"");
	}
	public void boire() {
		parler("Mmmm, un bon verre de "+ boissonFav +" ! GLOUPS !");
	}

//---------------------------------------------------------------------------------------------
	public void acheter(String bien, int prix) {
		if(argent>prix) {
			parler("J'ai "+argent+" sous en poche. Je vais pouvoir m'offrir "+bien+" a "+prix+" sous");
			perdreArgent(prix);
		}
		else {
			parler("Je n'ai plus que "+argent+" sous en poche. Je ne peux m�me pas m'offrir "+bien+" �\r\n" + 
					""+prix+" sous");
		}
	}
	
//---------------------------------------------------------------------------------------------
	public int gagnerArgent(int gain) {
		return argent+=gain;
	}
	public int perdreArgent(int perte) {
		return argent-=perte;
	}
}
