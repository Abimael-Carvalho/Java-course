package br.com.abim.javacore.introducaometodos.test;

import br.com.abim.javacore.introducaometodos.classes.Calculadora;

public class ParametrosTest {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        int num1 = 5 ;
        int num2 = 10;

        calc.alteraDoisNum(num1,num2);
        System.out.println("Dentro do test! ");
        System.out.println("num1 = "+num1);
        System.out.println("num1 = "+num2);

    }

}
