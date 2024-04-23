import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GerenciadorUsuario {
    private List<Usuario> usuarios = new ArrayList<>();
    // Métodos de CRUD aqui
    public void adicionarUsuario(Usuario usuario){
         usuarios.add(usuario);

    }
    public void obterTodosUsuarios(){
    }
    public void obterUsuarioPorId(String id){

    }
    public void atualizarUsuario(String id, String novoNome, String novoEmail){

    }
    public void removerUsuario(String id){

    }
}
