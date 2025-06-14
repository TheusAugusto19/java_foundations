package ui;

import java.io.PrintWriter;

import javax.swing.JOptionPane;

import model.Aluno;

public class CadastroAlunoGUI {
    public static void executar() throws Exception{
        String nome = JOptionPane.showInputDialog("digite o nome do aluno:");
        String endereco = JOptionPane.showInputDialog("digite o endereço do aluno:");
        String idadeString = JOptionPane.showInputDialog("digite a idade do aluno:");
        int idade = Integer.parseInt(idadeString);
        String matriculaString = JOptionPane.showInputDialog("digite a matricula do aluno:");
        int matricula = Integer.parseInt(matriculaString);

        Aluno aluno = new Aluno(nome, endereco, idade, matricula);
        // aluno.visualisar();

        // Persistência de dados em arquivos - .txt
       PrintWriter saida = new PrintWriter("alunos.txt");
       saida.println("nome, endereço, idade, matricula");
       saida.println(
        aluno.getNome() + ", " +
        aluno.getEndereco() + ", " + 
        aluno.getIdade() + ", " +
        aluno.getMatricula()
        );
       saida.close();


            
    }

}
