package br.com.abim.javacore.introducaometodos.test;

import br.com.abim.javacore.introducaometodos.classes.Calculadora;

public class CalculadoraTest {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        calc.somaDoisnum();
        System.out.println("Continue");
        System.out.println("****************************");
        calc.subtraiDoisNum();
        System.out.println("Continue");
        System.out.println("****************************");
        calc.multiplicaDoisNum(5,5);
        System.out.println("Continue");
        System.out.println("****************************");
        double result = calc.divideDoisNum(5,0);
        System.out.println(result);
        System.out.println("Continue");
        System.out.println("****************************");
        calc.imprimeDoisNumDivididos(20,0);
        System.out.println("Continue");
        System.out.println("****************************");

    }
}
