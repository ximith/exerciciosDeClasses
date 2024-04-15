package Models;

public class Carro extends Veiculo{

    private int numeroDePortas;

    public Carro(int numeroDePortas, String marca, String modelo, int ano) {
        super(marca, modelo, ano);
        this.numeroDePortas = numeroDePortas;
    }
    public void display(){
        System.out.println("Marca: "+getMarca()+" Modelo: "+getModelo()+" Ano: "+getAno()+" Numero de portas: "+numeroDePortas);
    }
}