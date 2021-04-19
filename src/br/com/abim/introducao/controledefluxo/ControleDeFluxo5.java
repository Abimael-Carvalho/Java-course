package br.com.abim.introducao.controledefluxo;

public class ControleDeFluxo5 {
    public static void main(String[] args) {
        //Dado o valor de um carro, descubra em quantas vezes ele pode ser parcelado.
        //As parcelas não podem ser menor que 1000
        double valorTotal =5000;
        for (int parcela = 1; parcela <=valorTotal; parcela++){
            double valorParcela = valorTotal / parcela;
            if (valorParcela < 1000) {
                break;
            }
                System.out.println("Parcelado em: " + parcela + " vezes, o valor de cada parcela é: " + valorParcela);
        }

    }
}
