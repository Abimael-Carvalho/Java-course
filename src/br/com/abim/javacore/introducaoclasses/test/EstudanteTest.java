package br.com.abim.javacore.introducaoclasses.test;

import br.com.abim.javacore.introducaoclasses.classes.Estudantes;

public class EstudanteTest {
    public static void main(String[] args) {
        Estudantes Joao = new Estudantes();
        Joao.nome = "João";
        Joao.matricula = "1212";
        Joao.idade = 15;
        System.out.println(Joao.nome);
        System.out.println(Joao.matricula);
        System.out.println(Joao.idade);

    }
}
