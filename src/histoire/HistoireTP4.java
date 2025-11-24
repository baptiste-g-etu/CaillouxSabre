package histoire;

import personnages.*;

public class HistoireTP4 {

	private static void histoire1() {
		// Scénario 1
		Humain prof = new Humain("Professeur", "Ciao kombucha", 54);
		prof.direBonjour();
		prof.acheter("une boisson", 12);
		prof.boire();
		prof.acheter("un jeu", 2);
		prof.acheter("un kimono", 50);
	}
	
	private static void histoire2() {
		// Scénario 2
		Commercant marco = new Commercant("Marco", 20);
		marco.direBonjour();
		marco.seFaireExtorquer();
		marco.recevoir(15);
		marco.boire();
		
	}
	
	private static void histoire3() {
		Yakuza yaku = new Yakuza("Yaku le noir", "whisky", 30, "Warsong");
		Commercant marco = new Commercant("Marco", 15);
		
		yaku.direBonjour();
		yaku.extorquer(marco);
		
	}
	
	private static void histoire4() {
		Commercant marco = new Commercant("Marco", 40);
		Ronin roro = new Ronin("Roro", "shochu", 60);
		roro.direBonjour();
		roro.donner(marco);
		
	}
	
	
	private static void histoire5() {
		Yakuza yaku = new Yakuza("Yaku le noir", "whisky", 45, "Warsong");
		Ronin roro = new Ronin("Roro", "shochu", 60);
		Commercant marco = new Commercant("Marco", 20);
		
		yaku.extorquer(marco);
		
		roro.provoquer(yaku);
	}
	
	public static void main(String[] args) {
		// histoire1();
		// histoire2();
		//histoire3();
		//histoire4();
		histoire5();
	}
}
