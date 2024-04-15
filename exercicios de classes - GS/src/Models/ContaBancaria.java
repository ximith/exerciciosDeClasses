package Models;

public class ContaBancaria {
    private String numeroDaConta;
    private String nomeDoTitular;
    private double saldo;

    public ContaBancaria() {
    }

    public ContaBancaria(String numeroDaConta, String nomeDoTitular) {
        this.numeroDaConta = numeroDaConta;
        this.nomeDoTitular = nomeDoTitular;
        this.saldo = 0;
    }

   public void depositar(double deposito){
        saldo = saldo + deposito;
    }
    public void sacar(double saque){
        saldo = saldo - saque;
    }

    public void imprimirExtrato(){

        System.out.println("Numero da conta: "+ numeroDaConta + " Titular da Conta: " +nomeDoTitular +" Saldo: "+saldo);
    }



}
