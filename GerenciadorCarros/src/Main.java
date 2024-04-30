
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        GerenciadorDeCarros gerenciador = new GerenciadorDeCarros();
        int opcao;
        boolean sair = false;
        Scanner sc = new Scanner(System.in);
        while(!sair) {
            System.out.println("Bem vindo usuário, selecione uma das opções!\n");
            System.out.println("1 = Adicionar Carro");
            System.out.println("2 = Listar Carros");
            System.out.println("3 = Atualizar Carro");
            System.out.println("4 = Remover Carro");
            System.out.println("5 = Sair");
            opcao = sc.nextInt();
            sc.nextLine();
            switch (opcao){
                case 1:{
                    System.out.println("Insira a placa do carro");
                    String placa = sc.nextLine();
                    System.out.println("insira o modelo do carro");
                    String modelo = sc.nextLine();
                    System.out.println("insira a cor do carro");
                    String cor = sc.nextLine();
                    System.out.println("insira o ano de fabricação do carro");
                    int ano = sc.nextInt();
                    sc.nextLine();
                    Carro carros = new Carro(placa,modelo,cor,ano);
                    if(!gerenciador.adicionarCarro(carros)){
                        System.out.println("Erro: Já existe um carro com essa placa");
                    }else{
                        System.out.println("O carro foi adicionado com sucesso!");
                    }
                    break;
                }
                case 2:{
                    List<Carro> Lista = gerenciador.obterTodosCarros();
                    Lista.forEach(System.out::println);
                    break;
                }
                case 3:{
                    System.out.println("insira a placa do carro que deseja atualizar");
                    String placa = sc.nextLine();
                    System.out.println("insira o novo modelo");
                    String modelo = sc.nextLine();
                    System.out.println("insira a nova cor");
                    String cor = sc.nextLine();
                    gerenciador.atualizarCarro(placa,modelo,cor);
                    break;
                }
                case 4:{
                    System.out.println("Insira a placado carro que deseja remover: ");
                    String placa = sc.nextLine();
                    gerenciador.removerCarro(placa);
                    break;
                }
                case 5:{
                    sair = true;
                    sc.close();
                    break;
                }
                default:{
                    System.out.println("Opção inválida");
                    break;
                }
            }
        }

    }
}