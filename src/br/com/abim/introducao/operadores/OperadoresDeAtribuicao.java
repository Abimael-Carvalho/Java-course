package br.com.abim.introducao.operadores;
/*Os operadores de atribuição são eles ( =, -=, -=, *=, /= e %=)*/

public class OperadoresDeAtribuicao {
    public static void main(String[] args) {
        float salario = 1000;
        int num = 11;
        //Caso queira acrescentar 800 a variavel salario é só usao o ( +=).
        //salário = salario + 800; é substituido por:
        //salario += 800;

        //Caso queira ,subtrair 800 a variavel salario é só usao o ( -=).
        //salário = salario - 800; é substituido por:
        //salario -= 800;

        //Caso queira receber seu salario acrecido de 10%
        //salario = salario + (float) (salario * 0.1); //Ou salario *= 0.1;

        num %= 2;
        System.out.println(num);
    }
}
