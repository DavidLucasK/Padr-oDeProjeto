public class ContaCorrente extends Component
{
	private String numConta;
	private float saldoConta;
	
	public ContaCorrente(String numConta, float saldoConta) {
		super();
		this.numConta = numConta;
		this.saldoConta = saldoConta;
	}
	
	public String getNumConta() {
		return numConta;
	}
	
	public float getSaldo() {
		return saldoConta;
	}
}