package exercicios;

public class Aluno {
	private String nome;
	private int idade;
	private int cpf;
	public static Aluno[] students;
	
	Aluno() {
		
	}
	
	Aluno(String nome, int idade, int cpf) {
		this.cpf = cpf;
		this.nome = nome;
		this.idade = idade;
	}
	
	public int getCpf() {
		return this.cpf;
	}
	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
	public String getNome() {
		return this.nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return this.idade;
	}
	public void setIdade (int idade) {
		this.idade = idade;
	}

}
