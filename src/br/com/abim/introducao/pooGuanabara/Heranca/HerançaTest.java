package br.com.abim.introducao.pooGuanabara.Heranca;

public class HerançaTest {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        Aluno p2 = new Aluno();
        Professor p3 = new Professor();
        Funcionario p4 = new Funcionario();

        p1.setNome("Pedro");
        p2.setNome("Maria");
        p3.setNome("Cláudio");
        p4.setNome("Fabiana");

        p1.setSexo("M");
        p2.setSexo("F");
        p3.setSexo("M");
        p4.setSexo("F");

        p1.setIdade(35);
        p2.setIdade(28);
        p3.setIdade(45);
        p4.setIdade(32);

        p2.setCurso("Engenharia Informática");
        p3.setSalario(5785.33f);
        p4.setSetor("Cozinha");

        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());


    }
}
