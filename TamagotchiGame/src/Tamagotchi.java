
public class Tamagotchi {

	
	String nom;
	String couleur;
	String type;
	int compteurFaim = 10;
	String faim;
	int vie = 100;
	
	/**
	 * 
	 */
	public Tamagotchi() {

	}

	/**
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * @param nom the nom to set
	 */
	public void setNom() {
		this.nom = Menu.demandeNom();
	}

	/**
	 * @return the couleur
	 */
	public String getCouleur() {
		return couleur;
	}

	/**
	 * @param couleur the couleur to set
	 */
	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}

	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}


	/**
	 * @param type the type to set
	 */
	public void setType() {
		
		switch (Menu.demandeType()) {
		
		case 1 :
			this.type = "Chien";
			break;
		case 2 :
			this.type = "Chat";
			break;
		default:
			System.out.println("Veuillez saisir 1 ou 2");
			this.setType();
			break;
		}
		
	}

	/**
	 * @return the faim
	 */
	public String getFaim() {
		return faim;
	}


	/**
	 * @param faim the faim to set
	 */
	public void setFaim(String faim) {
		this.faim = faim;
	}

	/**
	 * @return the compteurFaim
	 */
	public int getCompteurFaim() {
		return compteurFaim;
	}


	/**
	 * @param compteurFaim the compteurFaim to set
	 */
	public void setCompteurFaim(int x) {
		int min = 0;
		int max = 10;
		
		int somme = this.compteurFaim += x;
		
		if (somme > max) {
			this.compteurFaim = max;
		}
		else if (somme < min) {
			this.compteurFaim = min;
		}
		else {
			this.compteurFaim = somme;
		}
		
	}
	
	/**
	 * @return the vie
	 */
	public int getVie() {
		return vie;
	}

	/**
	 * @param vie the vie to set
	 */
	public void setVie(int x) {
		int min = 0;
		int max = 100;
		
		int somme = this.vie += x;
		
		if (somme > max) {
			this.vie = max;
		}
		else if (somme < min) {
			this.vie = min;
		}
		else {
			this.vie  = somme;
		}
	}

	@Override
	public String toString() {
		return "Tamagotchi [nom=" + nom + ", couleur=" + couleur + ", type=" + type + ", compteurFaim=" + compteurFaim
				+ ", faim=" + faim + "]";
	}
	
	
	public void manger() {
		this.compteurFaim++;
	}
	
	
}
