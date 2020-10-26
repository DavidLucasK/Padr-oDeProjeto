public class Main {
	public static void main(String[] args)
	{
		// criando a arvore component
		Component component = new CompositeAccount();
		
		// Adicionando todos os tipos de conta do cliente ao component
		component.add(new ContaCorrente("CC001", 100));
		component.add(new ContaCorrente("CC002", 150));
		component.add(new ContaPoupanca("CP001", 200));
		
		//pegando o saldo total do cliente
		float saldoTotal = component.getSaldo();
		System.out.println("Saldo Total: R$" + saldoTotal);
	}
}