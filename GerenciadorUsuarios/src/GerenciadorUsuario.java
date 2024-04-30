
import java.util.ArrayList;
import java.util.List;

public class GerenciadorUsuario {
    private List<Usuario> usuarioList = new ArrayList<>();
    boolean check =false;

    // Métodos de CRUD aqui
    public boolean adicionarUsuario(Usuario user){
        for(int i = 0;i<usuarioList.size();i++){
            if (usuarioList.get(i).getId().equals(user.getId())){
                return false;
            }
        }
        usuarioList.add(user);
        return true;
    }
    public List<Usuario> obterTodosUsuarios(){
        return usuarioList;
    }
    private Usuario obterUsuarioPorId(String id){
        for(Usuario usuario : usuarioList){
            if (usuario.getId().equals(id)){
                return usuario;
            }
        }
        return null;
    }
    public void atualizarUsuario( String id, String novoNome, String novoEmail){
        Usuario usuario = obterUsuarioPorId(id);
        if (usuario != null){
            usuario.setNome(novoNome);
            usuario.setEmail(novoEmail);
        }
    }
    public void atualizarUsuarioNome( String id, String novoNome){
        Usuario usuario = obterUsuarioPorId(id);
        if (usuario != null){
            usuario.setNome(novoNome);
        }
    }
    public void atualizarUsuarioEmail(String id, String novoEmail){
        Usuario usuario = obterUsuarioPorId(id);
        if (usuario != null){
            usuario.setEmail(novoEmail);
        }
    }

    public void removerUsuario(String id){
        usuarioList.removeIf(usuario -> usuario.getId().equals(id));
    }
}
