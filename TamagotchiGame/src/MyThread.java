
public class MyThread extends Thread {
	
	@Override
	public void run() {
		
		
		for (int i = 0 ; Main.mytama.vie > 0; i++ ) {
			sleep(10000);
			Main.mytama.setCompteurFaim(-1);	
			if (Main.mytama.getCompteurFaim() == 0) {
				Main.mytama.setVie(-1);	
			}
		}
	}

	/**
	 * @param x
	 */
	public static void sleep(int x) {

		try {
			Thread.sleep(x);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
}
