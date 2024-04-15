package Models;

public class Livro {
    private String titulo;
    private String autor;
    private int anoDePublicacao;
    private boolean estaEmprestado;

    public Livro() {
    }

    public Livro(String titulo, String autor, int anoDePublicacao) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoDePublicacao = anoDePublicacao;
        this.estaEmprestado = false;
    }

    public void emprestimo(){
        if(!estaEmprestado){
            System.out.println("O livro foi emprestado");
            estaEmprestado = true;
        }else{
            System.out.println("Erro: O livro já está emprestado");
        }

}
public void devolucao(){
        if(!estaEmprestado){
            System.out.println("Erro: O livro não está emprestado");
        }else{

            System.out.println("O livro foi devolvido");
            estaEmprestado = false;
        }

    }
    public void imprimirInformacoes(){
        System.out.println("\nTitulo: "+titulo+" Autor: "+autor+" Ano de publicação: "+anoDePublicacao);
    }
}

