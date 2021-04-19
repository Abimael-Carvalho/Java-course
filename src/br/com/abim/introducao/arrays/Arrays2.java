package br.com.abim.introducao.arrays;

public class Arrays2 {
    public static void main(String[] args) {
        // byte short, int, long, float, double são inicializados com o valor = 0.
        // char será inicializado com o valor = e mostrará:  ' '
        // boolean será inicializado com o valor = false
        // reference será inicializado com o valor = null

        String[] nome = new String[4];
        nome[0] = "Naruto";
        nome[1] = "Goku";
        nome[2] = "Luffy";
        nome[3] = "Kurosaki";
        for (int i = 0; i <= nome.length; i++){
            System.out.println(nome[i]);
        }

    }
}
