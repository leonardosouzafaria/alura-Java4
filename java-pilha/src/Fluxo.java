
public class Fluxo {

	public static void main(String[] args) {
	
		System.out.println("In�cio main");
		metodoUm();
		System.out.println("Fim do main");

	}
	
	private static void metodoUm() {
		
		System.out.println("In�cio do metodoUM");
		metodoDois();
		System.out.println("Fim do metodoUm");
		
	}
	
	private static void metodoDois() {
		
		System.out.println("In�cio do metodoDois");
		for(int i = 0; i <= 5 ; i++) {
			System.out.println(i);
		}
		
		System.out.println("Fim do metodoDois");
	}
}
