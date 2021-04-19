package br.com.abim.introducao.controledefluxo;//Estruturas condicionais (if, else).

public class ControleDeFluxo1 {
    public static void main(String[] args) {

        /* Idade < 15, categoria infantil
           Idade >= 15 && idade < 18 juvenil
           Idade >= 18 adulto */

        int idade = 18;
        float salario =2000;
        String categoria;

        if(idade < 15){
            categoria = "Infantil";
        }
        else if(idade >=15 && idade < 18){
            categoria = "Juvenil";
        }
        else{
            categoria = "Adulto";
        }
        System.out.println(categoria);
    }
}
