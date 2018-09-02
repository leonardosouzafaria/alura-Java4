
public class Conexao implements AutoCloseable {
	
	public Conexao() {
		System.out.println("Abrindo conexao");
	}
	
	public void leDados() {
		System.out.println("Recebendo dados");
		throw new IllegalStateException();
	}
	
	public void fecha() {
		System.out.println("Fechando conexão com método fecha");
	}
	
	@Override
	public void close() {
		System.out.println("Fechando conexão com o método close");
	}

}
