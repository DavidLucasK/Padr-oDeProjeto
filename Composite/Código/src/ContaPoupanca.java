public class ContaPoupanca extends Component
{
	private String numConta;
	private float saldoConta;
	
	public ContaPoupanca(String numConta, float saldoConta) {
		super();
		this.numConta = numConta;
		this.saldoConta = saldoConta;
	}
	
	public String getNumeroConta() {
		return numConta;
	}
	
	public float getSaldo() {
		return saldoConta;
	}
}