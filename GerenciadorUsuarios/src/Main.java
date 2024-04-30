import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        GerenciadorUsuario gerenciador = new GerenciadorUsuario();
        int opcao;
        boolean sair = false;
        Scanner sc = new Scanner(System.in);
        while(!sair) {
            System.out.println("Bem vindo usuário, selecione uma das opções!\n");
            System.out.println("1 = Adicionar usuário");
            System.out.println("2 = Listar usuários");
            System.out.println("3 = Atualizar usuário");
            System.out.println("4 = Remover usuário");
            System.out.println("5 = Sair");
            opcao = sc.nextInt();
            sc.nextLine();
            switch (opcao) {
                case 1: {

                    System.out.println("insira o ID");
                    String id = sc.nextLine();
                    System.out.println("insira o nome");
                    String nome = sc.nextLine();
                    System.out.println("insira o E-mail");
                    String mail = sc.nextLine();
                    Usuario user = new Usuario(id,nome,mail);
                    if(!gerenciador.adicionarUsuario(user)){
                        System.out.println("Erro: Já existe usuário com esse ID");
                    }else{
                        System.out.println("Usuário adicionado com sucesso!");
                    }
                    break;
                }
                case 2: {
                    List<Usuario> Lista = gerenciador.obterTodosUsuarios();
                    Lista.forEach(System.out::println);
                    break;
                }
                case 3: {
                    System.out.println("insira o ID do usuario que deseja atualizar");
                    String id = sc.nextLine();
                    System.out.println("insira o novo nome");
                    String nome = sc.nextLine();
                    System.out.println("insira o novo E-mail");
                    String mail = sc.nextLine();
                    gerenciador.atualizarUsuario(id,nome,mail);
                    break;
                }
                case 4: {
                    System.out.println("Insira o ID que deseja remover: ");
                    String id = sc.nextLine();
                   gerenciador.removerUsuario(id);
                   break;
                }
                case 5: {
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