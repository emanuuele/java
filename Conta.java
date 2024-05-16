package exercicios;

public class Conta {
	private int cpf;
	private String nome;
	private float saldo;

	Conta(int cpf , String nome, float saldo){
		this.cpf = cpf;
		this.nome = nome;
		this.saldo = saldo;
	}
	
	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	private void setSaldo(float saldo) {
		this.saldo = saldo;
	}
	
	public int getCpf() {
		return this.cpf;
	}
	public String getNome() {
		return this.nome;
	}
	private float getSaldo() {
		return this.saldo;
	}
	
	public float consultarSaldo() {
		return this.getSaldo();
	}
	public void sacar(float saque) {
		float valorAtual = this.getSaldo();
		this.setSaldo(valorAtual - saque);
	}
	public void depositar(float deposito) {
		float valorAtual = this.getSaldo();
		this.setSaldo(valorAtual + deposito);
	}
}
