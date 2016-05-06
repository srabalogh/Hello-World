
abstract class Conta {

	protected double saldo;

	public void deposita(double valor){
		if (valor < 0) {
			throw new ValorInvalidoException(valor);
		}else{
			this.saldo += valor;
		}
	}

	public double getSaldo() {
		return this.saldo;
	}

	public void saca(double valor) {
		this.saldo -= valor;
	}
	
	abstract void atualiza(double taxa);

}
