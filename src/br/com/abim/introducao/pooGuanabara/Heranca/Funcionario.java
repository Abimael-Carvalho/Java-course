package br.com.abim.introducao.pooGuanabara.Heranca;

public class Funcionario extends Pessoa {

    //Atributos
    private String setor;
    private boolean trabalhando;

    //Métodos
    public void mudarTrabalho(){
        this.trabalhando = ! this.trabalhando;
    }

    // Get and Set

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public boolean getTrabalhando() {
        return trabalhando;
    }

    public void setTrabalhando(boolean trabalhando) {
        this.trabalhando = trabalhando;
    }
}
