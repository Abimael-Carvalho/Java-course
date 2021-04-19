package br.com.abim.introducao.controledefluxo;

public class ControleDeFluxo2 {
    public static void main(String[] args) {
        int idade = 10;
        String status;
        if (idade < 18){
            status = "Não é adulto. ";
        }
        else {
            status = "É adulto. ";
        }

        System.out.println(status);
    }
}
