package br.com.abim.introducao.arrays;

public class Arrays3 {
    public static void main(String[] args) {
        //Formas de criar um array
        int[] numeros = new int[5];
        int[] numeros2 = {1,2,3,4,5};
        int[] numeros3 = new int[] {1,2,3,4,5,6,7,8,9,10};

        // Uma forma de iterar sobre um array
        for(int i = 0; i < numeros2.length;i++) {
            System.out.println(numeros2[i]);
        }

        // Outra forma de iterar sobre um array
        for(int aux : numeros3){
            System.out.println(aux);

        }


    }
}
