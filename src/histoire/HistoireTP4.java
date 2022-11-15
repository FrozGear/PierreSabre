package histoire;

import personnages.Humain;
import personnages.Commercant;
public class HistoireTP4 {
	
	public static void main(String[] args) {
		Humain teste = new Humain("Prof", "kombucha", 54);
		teste.direBonjour();
		teste.acheter("une boisson", 12);
		teste.boire();
		teste.acheter("un jeu", 2);
		teste.acheter("un kimono", 50);
		
		Commercant teste2 = new Commercant("Marco", 54);
		teste2.direBonjour();
		teste2.seFaireExtorquer();
		teste2.recevoir(15);
		teste2.boire();
		
		Yakuza teste3 = new Yakuza("Yaku Le Noir", 30);
//		teste3.nomDeClan("Warsong");
		teste3.direBonjour();
		teste3.extorquer(teste2);
	}
}
