package personnages;


public class Ronin  extends Humain{
	private int honneur = 1;
	
	public Ronin(String nom, String boissonFavorite, int argent) {
		super(nom, boissonFavorite, argent);
		
	}
	
	public void donner(Commercant beneficiaire) {
		int don = getArgent()/10;
		parler("Je donne " + don + " sous à " + beneficiaire.getNom() + ".");
		perdreArgent(don);
		beneficiaire.recevoir(don);
		//honneur +=1;
	}
	
	public void provoquer(Yakuza adversaire) {
		int force = honneur * 2;
		parler("Je te défie, " + adversaire.getNom() + "! Tu vas payer pour ce que tu as fait à ce pauvre marchand !");
	
		if(force >= adversaire.getReputation()) {
			parler("Je t'ai vaincu, " + adversaire.getNom() + "! Mon Honneur est sauf.");
			honneur +=1;
			gagnerArgent(adversaire.getArgent());
			adversaire.perdre();
		} else {
			parler("J'ai été vaincu... Mon honneur et ma bourse en prennent un coup.");
			honneur -=1;
			adversaire.gagner(getArgent());
		}
		
	}

}
