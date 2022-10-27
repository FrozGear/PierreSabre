package histoire;

import personnages.Humain;

public class HistoireTP4 {
	
	public static void main(String[] args) {
		Humain teste = new Humain("Prof", "kombucha", 54);
		teste.direBonjour();
		teste.acheter("une boisson", 12);
		teste.boire();
		teste.acheter("un jeu", 2);
		teste.acheter("un kimono", 50);
	}
}
