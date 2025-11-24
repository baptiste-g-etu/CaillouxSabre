package personnages;

public class Samourai extends Ronin{
	private String seigneur;
	
	public Samourai(String seigneur, String nom, String boissonFavorite, int argent) {
		super(nom, boissonFavorite, argent);
		this.seigneur = seigneur;
	}
	
	@Override
	public void direBonjour() {
		super.direBonjour();
		parler("Je suis fier de servir le seigneur " + seigneur + ".");
	}

	// Surcharge
	public void boire(String boisson) {
		parler("Tiens, je vais boire du " + boisson + ".");
	}
}
