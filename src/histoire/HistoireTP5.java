package histoire;

import personnages.*;

public class HistoireTP5 {

	private static void scenario1(){
		Commercant marco = new Commercant("Marco", 20);
		Commercant chonin = new Commercant("Chonin", 40);
		Commercant kumi = new Commercant("Kumi", 10);
		Yakuza yaku = new Yakuza("Yaku le Noir", "whisky", 30, "Warsong");
		Ronin roro = new Ronin("Roro", "shochu", 60);
		
		marco.faireConnaissanceAvec(roro);
		marco.faireConnaissanceAvec(yaku);
		marco.faireConnaissanceAvec(chonin);
		marco.faireConnaissanceAvec(kumi);
		
		marco.listerConnaissances();
		roro.listerConnaissances();
		yaku.listerConnaissances();
	}
		
	private static void scenario2() {
		Samourai akimoto = new Samourai("Miyamoto", "Akimoto", "sake", 80);
		Commercant marco = new Commercant("Marco", 20); 
		akimoto.faireConnaissanceAvec(marco);
		akimoto.listerConnaissances();
		akimoto.boire("thé vert");
	}
	
	
	public static void main(String[] args) {
		//scenario1();
		scenario2();
	}
	
}
