
public class TesteSaca {
	
	public static void main(String[] args) {
		
		Conta conta = new ContaCorrente(123,123);	
		
		conta.deposita(200);
		
		try	{
			conta.saca(200);
		} catch(Exception exception) {
			System.out.println(exception.getMessage());
			exception.printStackTrace();
		}
		
		System.out.println(conta.getSaldo());
	}
	
}
