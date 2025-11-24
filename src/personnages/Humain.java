package personnages;

public class Humain {
	private String nom;
	private String boissonFavorite;
	private int argent;
	protected Humain[] memoire = new Humain[3];
	protected int nbConnaissances = 0;
	
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
	
	
	
	// TP 5
	public void faireConnaissanceAvec(Humain humain2) {
		direBonjour();
		humain2.repondre(this);
		
		memoriser(humain2);
	}
	
	private void repondre(Humain humain1) {
		direBonjour();
		memoriser(humain1);
	}
	
	private void memoriser(Humain nouvelHumain) {
		if (nbConnaissances < memoire.length) {
			memoire[nbConnaissances] = nouvelHumain;
			nbConnaissances++;
		} else {
			memoire[nbConnaissances % 3] = nouvelHumain;
			nbConnaissances++;
		}
	}
	
	
	public void listerConnaissances() {
		if (nbConnaissances == 0) {
			parler("Je ne connais personne pour l'instant.");
		} else {
			int nb_memorises = nbConnaissances > memoire.length ? memoire.length : nbConnaissances;
			
			String liste = "Je connais beaucoup de monde dont : ";
			for (int i = 0; i < nb_memorises; i++) {
				liste += memoire[i].getNom();
				if (i < nb_memorises - 1) {
					liste += ", ";
				}
			}
			liste += ".";
			parler(liste);
		}
	}
	
}
