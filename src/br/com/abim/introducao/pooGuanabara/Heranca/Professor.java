package br.com.abim.introducao.pooGuanabara.Heranca;

public class Professor extends Pessoa {

    //Atributos
    private String especialidade;
    private float salario;

    //Métodos
    public void receberAumento(float aum) {
        this.salario += aum;
    }

    //Métodos Get and Set


    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
}
