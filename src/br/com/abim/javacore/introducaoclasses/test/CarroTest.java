package br.com.abim.javacore.introducaoclasses.test;

import br.com.abim.javacore.introducaoclasses.classes.Carros;

public class CarroTest {
    public static void main(String[] args) {
        Carros carro = new Carros();
        carro.modelo = "Fusca";
        carro.velocidadeMaxima = 89;
        carro.placa = "72-59-ZJ";
        System.out.println(carro.placa);
        System.out.println(carro.modelo);
        System.out.println(carro.velocidadeMaxima);

    }
}
