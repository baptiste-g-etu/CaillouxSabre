package personnages;

public class Humain {
	private String nom;
	private String boissonFavorite;
	private int argent;
	
	// Constructeur
	public Humain(String nom, String boissonFavorite, int argent) {
		this.nom = nom;
		this.boissonFavorite = boissonFavorite;
		this.argent = argent;
	}
	
	// Getters
	public String getNom() {
		return nom;
	}
	public String getBoissonFavorite() {
		return boissonFavorite;
	}
	public int getArgent() {
		return argent;
	}
	
	// Méthodes
	protected void gagnerArgent(int montant) {
		this.argent += montant;
	}
	
	protected void perdreArgent(int montant) {
		this.argent -= montant;
	}
	
	public void acheter(String bien, int prix) {
		if (argent >= prix) {
			perdreArgent(prix);
			parler("J'ai " + argent + " en poche. Je vais donc pouvoir m'acheter un " + bien + " pour " + prix + " sous.");
		} else {
			parler("Je n'ai que " + argent + " donc je ne peux pas m'acheter ce bien à " + prix + " sous. Je n'ai pas assez d'argent.");
		}
	}
	
	protected void parler(String texte) {
		System.out.println(nom + " : \"" + texte + "\"");
	}
	
	public void direBonjour() {
		parler("Bonjour ! Je m'appelle " + nom + " et j'aime boire du " + boissonFavorite + ".");
	}
	
	public void boire() {
		parler("Mmmm, un bon verre de " + boissonFavorite + " !");
	}
	
	
}
