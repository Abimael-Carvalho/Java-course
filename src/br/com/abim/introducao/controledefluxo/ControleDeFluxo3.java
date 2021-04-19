package br.com.abim.introducao.controledefluxo;

//Aprendendo a utilizar o switch
public class ControleDeFluxo3 {
    public static void main(String[] args) {
        byte dia = 3;
        switch (dia) {
          case 1:
              System.out.println("Domingo");
              break;
          case 2:
              System.out.println("Segunda");
              break;
          case 3:
              System.out.println("Terça");
              break;
          case 4:
              System.out.println("Quarta");
              break;
          case 5:
              System.out.println("Quinta");
              break;
          case 6:
              System.out.println("Sexta");
              break;
          case 7:
              System.out.println("Sábado");
              break;
        }
        String sexo = "FM";
        switch (sexo){
            case "F":
                System.out.println("Feminino");
                break;
            case "M":
                System.out.println("Masculino");
                break;
            default:
                System.out.println("Opção inválida");
        }
    }
}
