public class CompositeAccount extends Component
{
	public float getSaldo() {
		float saldoTotal = 0;
		for (Component f : list) {
			saldoTotal = saldoTotal + f.getSaldo();
		}
		return saldoTotal;
	}
}