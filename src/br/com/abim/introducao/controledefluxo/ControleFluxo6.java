package br.com.abim.introducao.controledefluxo;

public class ControleFluxo6 {
    public static void main(String[] args) {
        double valorTotal =30000;
        for (int parcela = (int) valorTotal; parcela >= 1; parcela--){
            double valorParcela = valorTotal / parcela;
            if (valorParcela < 1000){
                continue;
            }
            System.out.println("Parcelado em: " + parcela + " vezes, o valor de cada parcela é: " + valorParcela);

        }
    }
}
