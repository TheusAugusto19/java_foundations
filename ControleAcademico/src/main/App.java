package main;

import model.Aluno;

public class App {
    public static void main(String[] args) throws Exception {
       Aluno aluno = new Aluno();
       aluno.setNome("Matheus Augusto");
       aluno.setEndereco("Rua 1");
       aluno.setIdade(17);
       aluno.setMatricula(1);
       aluno.visualisar();
       System.out.println("\n");
       Aluno aluno2 = new Aluno(
        "Peterson Alves", 
        "Cohab 2", 
        30, 
        2);
        aluno2.visualisar();
        
       
    }

    

    
}
