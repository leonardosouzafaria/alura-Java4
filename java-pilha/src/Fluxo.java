
public class Fluxo {

	public static void main(String[] args) {

		System.out.println("Início main");

		try {

			metodoUm();

		} catch (Exception e) {
			String mensagem = e.getMessage();
			System.out.println("Exception" + mensagem);
			e.printStackTrace();
		}
		System.out.println("Fim do main");

	}

	private static void metodoUm() throws MinhaExcecao {

		System.out.println("Início do metodoUM");
		metodoDois();
		System.out.println("Fim do metodoUm");

	}

	private static void metodoDois() throws MinhaExcecao {

		System.out.println("Início do metodoDois");

		/*
		 * ArithmeticException exception = new ArithmeticException(); throw exception;
		 */

		throw new MinhaExcecao("Deu ruim parsa");

		// System.out.println("Fim do metodoDois");
	}
}
