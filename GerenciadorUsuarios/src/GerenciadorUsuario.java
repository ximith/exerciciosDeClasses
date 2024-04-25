import java.util.ArrayList;
import java.util.List;

public class GerenciadorUsuario {
    private List<Usuario> usuarioList = new ArrayList<>();
    boolean check =false;

    // Métodos de CRUD aqui
    public void adicionarUsuario(Usuario user){
        for(int i = 0;i<usuarioList.size();i++){
            if (usuarioList.get(i).getId().equals(user.getId())){
                check = true;
            }
        }
        if (check == true){
            System.out.println("um erro ocorreu: id inserido já está registrado");
            check = false;
        }
        else {
        usuarioList.add(user);
        }
    }
    public void obterTodosUsuarios(){
        for(int i = 0;i<usuarioList.size();i++){
            System.out.println(usuarioList.get(i));

        }
    }
    public Integer obterUsuarioPorId(String id){
        for(int i = 0;i<usuarioList.size();i++){
            if (usuarioList.get(i).getId().equals(id)){
                return i;
            }
        }
        return null;
    }
    public void atualizarUsuario(int id, Usuario novoid){
        usuarioList.set(id,novoid);
    }
    public void removerUsuario(String id){

    }
}
