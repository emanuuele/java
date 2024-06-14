package manipular;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.File;
import java.util.Scanner;

import aluno.Aluno;

import java.io.FileReader;


public class Manipulador {

	public static void main(String[] args) {
		String path = "C:\\Users\\UPE SURUBIM\\Desktop\\aula7.txt";

		try (PrintWriter write = new PrintWriter(path)){
			Aluno alunos = new Aluno("Manu", "58779546558");
			Aluno ana = new Aluno("Ana", "58779546558");
			Aluno manu = new Aluno("Manu", "58779546558");
			alunos.criarAluno(ana);
			alunos.criarAluno(manu);
			for (int i = 0; i < alunos.getAlunos().length; i++) {
				System.out.println(alunos.getAlunos()[i]);
				write.println(alunos.getAlunos()[i]);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		
	}

}
