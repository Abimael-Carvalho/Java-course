package br.com.abim.javacore.introducaometodos.classes;

public class Calculadora {
    public void somaDoisnum(){
        System.out.println(5+5);

    }
    public void subtraiDoisNum(){
        System.out.println(5-2);
    }
    //Como passar parâmetros para os metodos
    public void multiplicaDoisNum(int num1, int num2){
        System.out.println(num1*num2);

    }
    public double divideDoisNum(double num1, double num2){
        if (num2 != 0) {
            return num1 / num2;
        }
        return 0;
    }
    public void imprimeDoisNumDivididos(double num1,double num2){
        if (num2 !=0) {
            System.out.println(num1 / num2);
            return;
        }
            System.out.println("Não é possível dividir por zero! ");
    }
    public void alteraDoisNum (int num1, int num2){
        num1 = 30;
        num2 = 40;
        System.out.println("Dentro do AlteraDoisNum! ");
        System.out.println("num1 = "+num1);
        System.out.println("num1 = "+num2);

    }

}
