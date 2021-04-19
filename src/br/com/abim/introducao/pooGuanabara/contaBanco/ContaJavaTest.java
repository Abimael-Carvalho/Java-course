package br.com.abim.introducao.pooGuanabara.contaBanco;


public class ContaJavaTest {
    public static void main(String[] args) {

        //Primeira conta!
        ContaBanco p1 = new ContaBanco();
        p1.setNumConta(1111);
        p1.setDono("Jairo");
        p1.abrirConta("CC");

        //Segunda conta!
        ContaBanco p2 = new ContaBanco();
        p2.setNumConta(2222);
        p2.setDono("Giulia");
        p2.abrirConta("CP");

        //Depósito nas contas!
        p1.depositar(100);
        p2.depositar(500);

        //Saques nas contas!
        p1.sacar(1000);
        p2.sacar(1000);

        //Tentativa de fechar a conta com saldo!
        p1.fecharConta();

        //Outputs com o status da conta!
        p1.estadoAtual();
        p2.estadoAtual();

    }
}
