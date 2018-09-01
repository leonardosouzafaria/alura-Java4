
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
		
		/*ArithmeticException exception = new  ArithmeticException();
		throw exception;*/
		
		throw new ArithmeticException("Mensagem de Exception");
		
		//System.out.println("Fim do metodoDois");
	}
}
