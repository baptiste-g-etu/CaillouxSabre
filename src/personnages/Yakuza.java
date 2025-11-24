package personnages;

public class Yakuza extends Humain{
	private String clan;
	private int reputation = 0;
	
	public Yakuza(String nom, String boissonFavorite, int argent, String clan) {
		super(nom, boissonFavorite, argent);
		this.clan = clan;
	}
	
	
	public int getReputation() {
		return reputation;
	}
	
	public void extorquer(Commercant victime) {
		parler("Oh un commercant ! Je vais lui extorquer de l'argent.");
		parler(victime.getNom() + ", si tu tiens à la vie donne moi ton argent !");
		
		int montantExtorque = victime.seFaireExtorquer();
		gagnerArgent(montantExtorque);
		reputation += 1;
		parler("J'ai extorqué " + montantExtorque + " sous au commerçant, me voilà donc à " + getArgent() + " sous. \n\tMa réputation dans le clan " + clan + " est maintenant de " + reputation + ".");
	
	}
	
	
	public int perdre() {
		perdreArgent(getArgent());
		--reputation;
		parler("J'ai perdu tout mon argent et ma réputation est maintenant de " + reputation + ". J'ai déhonoré le clan " + clan + "...");
		
		assert getArgent() == 0 : "Erreur : L'argent du Yakuza n'est pas nul après avoir tout perdu.";
		return getArgent();
	}
	
	public int gagner(int montant) {
		gagnerArgent(montant);
		++reputation;
		parler("J'ai gagné " + montant + " sous et ma réputation est maintenant de " + reputation + ".");
		
		return getArgent();
	}
	
	

}
