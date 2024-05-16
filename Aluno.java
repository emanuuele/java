package heranca;

public class Aluno extends Pessoa {
	private String matricula;
	private String curso;
	
	//os atributos de Pessoa devem estar no construtor
	public Aluno(String matricula, String curso, String nome, int idade){
		// os atributos da classe mãe deve usar o super
		super(nome, idade);
		this.curso = curso;
		this.matricula = matricula;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}
}
