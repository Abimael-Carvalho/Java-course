package br.com.abim.introducao.pooGuanabara.contaBanco;

import org.omg.PortableServer.LIFESPAN_POLICY_ID;

import java.security.PublicKey;

public class ContaBanco {
    //Atributos
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    public void estadoAtual() {
        System.out.println("------------------------------");
        System.out.println("Conta: "+this.getNumConta());
        System.out.println("Tipo: "+this.getTipo());
        System.out.println("Dono: "+this.getDono());
        System.out.println("Saldo: "+this.getSaldo());
        System.out.println("Status: "+this.getStatus());

    }
    //Métodos Personalizados
    public void abrirConta(String tipo) {
        this.setTipo(tipo);
        this.setStatus(true);
        if (tipo == "CC"){
            this.setSaldo(50);
        }else if (tipo == "CP"){
            this.setSaldo(150);
        }
        System.out.println("Conta aberta com sucesso! ");
    }
    public void fecharConta(){
        if (this.getSaldo() >0) {
            System.out.println("Impossível fechar a conta com saldo positivo! ");
        }else if (this.getSaldo()<0) {
            System.out.println("Impossível fechar a conta com saldo negativo! ");
        }else {
            this.setStatus(false);
            System.out.println("Conta fechada com sucesso! ");
        }
    }
    public void depositar(float valor){
        if (this.getStatus()) {
            this.setSaldo(this.getSaldo() + valor);
            System.out.println("Depósito realizado na conta de "+this.getDono());
        }else {
            System.out.println("Impossível depositar. Conta desativada! ");
        }
    }
    public void sacar(float valor){
        if (this.getStatus()){
            if (this.getSaldo() >= valor){
                this.setSaldo(this.getSaldo() - valor);
                System.out.println("Saque realizado com sucesso!  Retire seu dinheiro! ");
            }else {
                System.out.println(" Saldo insuficiente! ");
            }
        }else {
            System.out.println(" Impossível sacar. Conta desativada! ");
        }
    }
    public void taxaManutencaoConta(){
        int valor = 0;
        if (this.getTipo() == "CC"){
            valor = 12;
        }else if (this.getTipo() == "CP"){
            valor = 20;
        }
        if (this.getStatus()) {
            this.setSaldo(this.getSaldo() - valor);
            System.out.println("Mensalidade paga! ");
        }else{
            System.out.println("Conta fechada! ");
        }
    }

    public ContaBanco() {
        this.numConta = numConta;
        this.setSaldo(0);
        this.setStatus(false);
        this.numConta = numConta;
    }

    public int getNumConta() {
        return this.numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return this.dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return this.saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
