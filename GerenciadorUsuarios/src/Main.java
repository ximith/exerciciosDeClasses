import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        GerenciadorUsuario gerenciador = new GerenciadorUsuario();
        int opcao;
        boolean sair = false;
        Scanner sc = new Scanner(System.in);
        while(sair == false) {
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
                    gerenciador.adicionarUsuario(user);
                    break;
                }
                case 2: {
                     gerenciador.obterTodosUsuarios();
                     break;
                }
                case 3: {
                    System.out.println("insira o ID do usuario que deseja atualizar");
                    String id = sc.nextLine();
                    gerenciador.obterUsuarioPorId(id);
                    if(id == null){
                        System.out.println("Error: não existe usuário com esse ID");
                        break;
                    }
                    System.out.println("insira o novo ID");
                    String novoId = sc.nextLine();
                    System.out.println("insira o novo nome");
                    String nome = sc.nextLine();
                    System.out.println("insira o novo E-mail");
                    String mail = sc.nextLine();
                    Usuario user = new Usuario(novoId,nome,mail);
                    gerenciador.atualizarUsuario(Integer.parseInt(id),user);
                }
                case 4: {
                   // obterUsuarioPorId(String id);
                   // removerUsuario(String id);
                }
                case 5: {
                    sair = true;
                    break;
                }

            }

        }
    }
}