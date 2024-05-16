package exercicios;

import java.util.ArrayList;
import java.util.Scanner;
import exercicios.Calculadora;

public class Principal {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//criando um objeto com construtor
		Conta conta = new Conta(111, "Emanuele", 1000);
		
		//criando uma lista de alunos
		Aluno[] aluno = new Aluno[20];
		aluno[0] = new Aluno("Emanuele", 20, 111);
		System.out.println(aluno[0].getNome());
		System.out.println(aluno[3]);
		
		ArrayList<Aluno> listaAlunos = new ArrayList<Aluno>();
		
		//chamando uma função sem ter que instanciar um objeto (é necessário importar a classe - linha 4)
		System.out.println(Calculadora.somar(1, 2, 3));;
		
		System.out.println(Calculadora.multiplicar(2, 0));
	}

}
