
public class Main {

	public static void main(String[] args) {
		Cliente venilton = new Cliente();
		venilton.setNome("Venilton");
		Banco banco = new Banco();
		banco.setNome("BB");
		
		Conta cc = new ContaCorrente(venilton,banco);
		Conta poupanca = new ContaPoupanca(venilton,banco);

		cc.depositar(100);
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
		System.out.println(String.format("Contas: %s", banco.getContas()));
	}

}
