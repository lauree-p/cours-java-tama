import utils.Clavier;

public class Game {
	
	public static void printMenuAction() {
		
		System.out.println("Menu des Actions :");
		System.out.println("(0)Voir les informations");
		System.out.println("(1)Manger");
		
	}
	
	public static int demandeAction() {
		
		int action = Clavier.lireInt();
		
		return action;
	
	}
	
	public static void verifAction() {
		
		switch (demandeAction()) {
		
			case 0 :
				System.out.println(Main.mytama.toString());
				action();
			case 1 :
				Main.mytama.manger();
				action();
				break;
			default:
				demandeAction();
				break;
		}
	}
	
	public static void action() {
		printMenuAction();
		verifAction();
	}
}
