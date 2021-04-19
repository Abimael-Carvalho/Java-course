package br.com.abim.javacore.introducaometodos.test;

import br.com.abim.javacore.introducaometodos.classes.Professor;

public class ProfessorTest {
    public static void main(String[] args) {
        Professor prof=new Professor();
        prof.cpf = "564.363.376-27";
        prof.matricula = "98492sdfs";
        prof.rg = "fasdf898410651";
        prof.nome = "Jandira";

        Professor prof1=new Professor();
        prof1.cpf = "-27";
        prof1.matricula = "98716";
        prof1.rg = "açlsdkfk65465";
        prof1.nome = "juca";

        prof.imprime();
        System.out.println("==========================");
        prof1.imprime();



    }
}
