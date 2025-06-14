package main;

import model.Professor;

public class App {
     public static void main(String[] args) throws Exception {
        Professor professor = new Professor();
        professor.setNome("Paulo");
        professor.setEndereco("rua'");
        professor.setIdade(22);
        professor.setMatricula(1);
        professor.setCpf("21964782163394");
        professor.setAtuacao("programação");
        professor.visualisar();
       
    }

    

    
}
