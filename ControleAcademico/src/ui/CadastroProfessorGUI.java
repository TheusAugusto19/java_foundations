package ui;

import java.io.PrintWriter;

import javax.swing.JOptionPane;

import model.Aluno;
import model.Professor;

public class CadastroProfessorGUI {
    public static void executar() throws Exception{
        String nome = JOptionPane.showInputDialog("digite o nome do professor:");
        String endereco = JOptionPane.showInputDialog("digite o endereço do professor:");
        String idadeString = JOptionPane.showInputDialog("digite a idade do professor:");
        int idade = Integer.parseInt(idadeString);
        String matriculaString = JOptionPane.showInputDialog("digite a matricula do professor:");
        int matricula = Integer.parseInt(matriculaString);
        String cpf = JOptionPane.showInputDialog("figite o CPF do professor:");
        String atuacao = JOptionPane.showInputDialog("digite a area de atuação do professor:");

        Professor professor = new Professor(nome, endereco, idade, matricula, cpf, atuacao);
        // aluno.visualisar();

        // Persistência de dados em arquivos - .txt
       PrintWriter saida = new PrintWriter("professor.txt");
       saida.println("nome, endereço, idade, matricula, cpf, atuacao");
       saida.println(
        professor.getNome() + ", " +
        professor.getEndereco() + ", " + 
        professor.getIdade() + ", " +
        professor.getMatricula() + ", "+
        professor.getCpf() + ", " +
        professor.getAtuacao()
        );
       saida.close();
    
}
