import javax.swing.JOptionPane;

public class Calculadora {
    private double num1;
    private double num2;
    private char operacao;

    public Calculadora() {
    }

    public Calculadora(double num1, double num2, double resultado) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public double getNum1() {
        return num1;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }

    public double soma (){
        return this.num1 + this.num2;
    }

    public double subtracao(){
        return this.num1 - this.num2;
    }

    public double multiplicacao(){
        return this.num1 * this.num2;
    }

    public double divisao(){
        return this.num1 / this.num2;
    }

    public void visualizarTodos(){
        JOptionPane.showMessageDialog(null, 
            "Resultado: \n" +
            "soma: " + this.soma() +
            "\n subtração: " + this.subtracao() +
            "\n multiplicação: " + this.multiplicacao() +
            "\n divisao: " + this.divisao()
        );

    }
    
    public void visualizar(String operacao) {
        double[] resultado = {
            this.soma(),
            this.subtracao(),
            this.divisao(),
            this.multiplicacao()
        };
        String operacoes = "+-/*";

        int indiceOperacao = operacoes.indexOf(operacao);

        JOptionPane.showMessageDialog(
            null,
            this.num1 +  operacao + this.num2 + 
            "=" + resultado[indiceOperacao]);
    }
  
}