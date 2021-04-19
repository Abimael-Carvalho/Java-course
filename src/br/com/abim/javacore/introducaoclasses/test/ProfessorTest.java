package br.com.abim.javacore.introducaoclasses.test;

import br.com.abim.javacore.introducaoclasses.classes.Professor;

public class ProfessorTest {
    public static void main(String[] args) {
        Professor prof = new Professor();
        prof.nome = "Abimael";
        prof.matricula = "1011112131";
        prof.rg = "AB-14.879.658";
        prof.cpf = "798.363.978-27";

        Professor prof2 = new Professor();
        prof2.nome = "Eliza";
        prof2.matricula = "123BDGS";
        prof2.rg = "315a1sdf46161";
        prof2.cpf = "asd65465466540";

        System.out.println(prof.nome);
        System.out.println(prof.matricula);
        System.out.println(prof.rg);
        System.out.println(prof.cpf);

        System.out.println("=================================");

        System.out.println(prof2.nome);
        System.out.println(prof2.matricula);
        System.out.println(prof2.rg);
        System.out.println(prof2.cpf);
    }

}
