
public class TestaContaComExcecaoChecked {

	public static void main(String[] args) {

		Conta conta = new Conta();

		try {
			conta.deposita();
		} catch (MinhaExcecao exception) {
			System.out.println("Tratamento");
		}

	}

}
