package br.com.abim.introducao.controledefluxo;

public class ExercicioControleFluxo {
    public static void main(String[] args) {
        /*
        Crie uma variável salario e imprima seu imposto.
        salario < 1000, 5%
        salario >=1000 && < 2000, 10%
        salario >=2000 && < 4000, 15%
        salario >=4000, 20%
         */

        double salario = 500;
        double imposto = 0;

        if(salario < 1000){
            imposto = salario *0.05;
        }
        else if((salario >=1000) && (salario < 2000)){
            imposto = salario *0.1;
        }
        else if((salario >=2000) && (salario < 4000)){
            imposto = salario * 0.15;
        }
        else{
            imposto = salario * 0.20;
        }
        System.out.println(imposto);
    }
}
