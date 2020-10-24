
public class Main {
	
	public static Tamagotchi mytama = new Tamagotchi();
	
	public static void main(String[] args) {
		
		Menu.startMenu();

		MyThread myThread = new MyThread();
		myThread.start();
		System.out.println(mytama.toString());
		Game.action();
	
	}

}
