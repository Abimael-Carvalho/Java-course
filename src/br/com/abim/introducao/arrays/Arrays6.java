package br.com.abim.introducao.arrays;

public class Arrays6 {
    public static void main(String[] args) {
//        int[][] dias = new int[3][];
        // Formas de inicializar um array:
        // Forma1: int[] array1 = {1,2,3,4,5,6};
        // Forma2: int[] array2 = new int[3];
        // Forma3: int[] array3 = new int[] {1,2,3,4,5,6}
//        dias [0] =new int[2];
//        dias [1] =new int[]{1,2,3};
//        dias [2] =new int[4];

        //Forma direta de inicializar um array multidimencional
        int[][] dias =  {{0,0},{1,2,3},{0,0,0,0}};
        for (int[] arr : dias){
            for (int num : arr){
                System.out.println(num);
            }
        }

    }
}
