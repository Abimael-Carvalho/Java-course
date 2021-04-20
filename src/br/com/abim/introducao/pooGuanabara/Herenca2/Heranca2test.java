package br.com.abim.introducao.pooGuanabara.Herenca2;

public class Heranca2test extends Pessoa {
    public static void main(String[] args) {
// Teste instanciar abstract class       Pessoa p1 = new Pessoa();

//      Teste classe br.com.abim.introducao.pooGuanabara.Herenca2.Visitante
        Visitante v1 = new Visitante();
        v1.setNome("juvenal");
        v1.setIdade(22);
        v1.setSexo("M");
        System.out.println(v1.toString());

        Aluno a1 = new Aluno();
        a1.setNome("Claudio");
        a1.setMatricula(11);
        a1.setCurso("Informática");
        a1.setIdade(16);
        a1.setSexo("M");

        System.out.println(a1.toString());


    }
}