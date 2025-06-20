package model;

public class Professor {
    private String nome;
    private String endereco;
    private int idade;
    private int matricula;
    private String cpf;
    private String atuacao;

    public Professor() {}

    public Professor(String nome, String endereco, int idade, int matricula, String cpf, String atuacao) {
        this.nome = nome;
        this.endereco = endereco;
        this.idade = idade;
        this.matricula = matricula;
        this.cpf = cpf;
        this.atuacao = atuacao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getAtuacao() {
        return atuacao;
    }

    public void setAtuacao(String atuacao) {
        this.atuacao = atuacao;
    }
    @Override
    public String toString() {
        return "Professor [nome=" + nome + ", endereco=" + endereco + ", idade=" + idade + ", matricula=" + matricula + ", CPF=" + cpf + ", Atuação" + atuacao +"]";
    }

    public void visualisar(){
        System.out.println("Nome: " + nome);
        System.out.println("Endereço: " + endereco);
        System.out.println("Idade: " + idade);
        System.out.println("Número de Matrícula: " + matricula);
        System.out.println("CPF:" + cpf);
        System.out.println("Atuação:" + atuacao);
    }
    
    
}
