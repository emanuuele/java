package aluno;

import java.util.ArrayList;

public class AlunoList {

	private String nome;
	private String cpf;
	
	ArrayList<Aluno> alunos = new ArrayList<Aluno>();
	
	public Aluno(String nome, String cpf){
		this.nome = nome;
		this.cpf = cpf;
	}
	
	public void criarAluno(Aluno aluno) {
		
		alunos.add(aluno);
	}
	public Aluno(){
		
	}
	
	public String getNome() {
		return this.nome;
	}
	public String getCpf() {
		return this.cpf;
	}
	
	public String[] getAlunos() {
		String[] retornoAlunos = new String[alunos.size()];
		for (int i = 0; i < alunos.size(); i++) {
			String aluno = String.format("Nome: %s \nCPF: %s", alunos.get(i).getNome(), alunos.get(i).getCpf());
			retornoAlunos[i] = aluno;
		}
		return retornoAlunos;
	}
	
}
