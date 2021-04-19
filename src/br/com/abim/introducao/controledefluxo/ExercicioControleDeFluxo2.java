package br.com.abim.introducao.controledefluxo;

public class ExercicioControleDeFluxo2 {
    public static void main(String[] args) {
        int dia = 8;
        String youn = null;

        switch (dia){
            case 1:
                youn = "Hoje é Domingo e é final de semana! ";
                break;
            case 2:
                youn = "Hoje é Segunda feira e é dia útil!";
                break;
            case 3:
                youn = "Hoje é Terça feira e é dia útil!";
                break;
            case 4:
                youn = "Hoje é Quarta feira e é dia útil!";
                break;
            case 5:
                youn = "Hoje é Quinta feira e é dia útil!";
                break;
            case 6:
                youn = "Hoje é Sexta feira e é dia útil!";
                break;
            case 7:
                youn = "Hoje é Sabado e é final de semana! ";
                break;
            default:
                System.out.println("Opção inválida ");
                break;

        }
        System.out.println(youn);
    }
}
