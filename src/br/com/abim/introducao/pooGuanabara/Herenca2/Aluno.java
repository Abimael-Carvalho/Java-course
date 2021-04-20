package br.com.abim.introducao.pooGuanabara.Herenca2;

import br.com.abim.introducao.pooGuanabara.Herenca2.Pessoa;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Aluno extends Pessoa {
    private int matricula;
    private String curso;

    public void pagarMensalidade() {
        System.out.println("Pagando mensalidade de aluno");
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

}
