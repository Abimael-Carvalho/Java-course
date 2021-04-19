package br.com.abim.introducao.controledefluxo;

public class ControloDeFluxo4 {
    public static void main(String[] args) {
        int contador = 11;
        while (contador < 10 ) {
            System.out.println(++contador);
        }
        contador = 0;
        do {
            System.out.println("Dentro do while! "+ contador++);
        }while (contador < 11);

        for (int i = 0; i < 10; i++){
            System.out.println("O valor de i é: "+i);
            if (i ==5){
                break;
            }
        }
    }
}
