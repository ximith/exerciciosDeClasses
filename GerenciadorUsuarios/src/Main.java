import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int opcao;
        boolean sair = false;
        Scanner sc = new Scanner(System.in);
        while(sair = false) {
            System.out.println("Bem vindo usuário, selecione uma das opções!\n");
            System.out.println("1 = Adicionar usuário");
            System.out.println("2 = Listar usuários");
            System.out.println("3 = Atualizar usuário");
            System.out.println("4 = Remover usuário");
            System.out.println("5 = Sair");
            opcao = sc.nextInt();
            switch (opcao) {
                case 1: {
                    System.out.println("insira ");
                }
                case 2: {
                }
                case 3: {
                }
                case 4: {
                }
                case 5: {
                    sair = true;
                    break;
                }

            }

        }
    }
}