
public class Fluxo {

	public static void main(String[] args) {

		System.out.println("Início main");
		
		try {
			
			metodoUm();
			
		} catch (ArithmeticException | NullPointerException e) {
			String mensagem = e.getMessage();
			System.out.println("Exception" + mensagem);
		
			System.out.println("Rastro do Exception");
			
			e.printStackTrace();
		}
		System.out.println("Fim do main");

	}

	private static void metodoUm() {

		System.out.println("Início do metodoUM");
		metodoDois();
		System.out.println("Fim do metodoUm");

	}

	private static void metodoDois() {

		System.out.println("Início do metodoDois");
		for (int i = 0; i <= 5; i++) {
			System.out.println(i);
			
			Conta c = null;
			
			c.deposita();
			
			int a = i / 0;
		}

		System.out.println("Fim do metodoDois");
	}
}
