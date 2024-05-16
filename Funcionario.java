package heranca;

public class Funcionario extends Pessoa{
	private float salario;
	private String cargo;
	Funcionario(String nome, int idade, String cargo, float salario) {
		super(nome, idade);
		this.cargo = cargo;
		this.salario = salario;
	}
	public float getSalario() {
		return salario;
	}
	public void setSalario(float salario) {
		this.salario = salario;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
}
