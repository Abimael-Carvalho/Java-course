package br.com.abim.introducao.pooGuanabara.PrLivro;

public class Pessoa {
    // Atributos
    private String nome;
    private int idade;
    private String sexo;

    // Métodos
    public void fazerAniversario() {
        this.idade ++;
    }

    // Métodos constructor

    public Pessoa(String nome, int idade, String sexo) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
    }

    // Métodos Get e Set

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
}
