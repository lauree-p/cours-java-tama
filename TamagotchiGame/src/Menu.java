import utils.Clavier;

public class Menu {
	
	
	public static void startMenu() {
		
		donneNomAuTama();
		donneTypeAuTama();
	}
	
	
	public static void printDemandeNom() {
		
		System.out.println("Entrer le nom de votre nouveau Tamagotchi :");
	
	}

	public static String demandeNom() {
		
		String nomUser = Clavier.lireString();
		
		return nomUser;
	}

	public static void donneNomAuTama() {
		
		printDemandeNom();
		
		Main.mytama.setNom();
	}

	
	public static void printDemandeType() {
		
		System.out.println("Entrer le type de votre nouveau Tamagotchi :\n-(1)Chien\n-(2)Chat");
		
	
	}
	
	public static int demandeType() {
		
		int typeUser = Clavier.lireInt();
		
		return typeUser;
	
	}
	
	public static void donneTypeAuTama() {
		
		printDemandeType();
		
		Main.mytama.setType();
		
	}
	
}
