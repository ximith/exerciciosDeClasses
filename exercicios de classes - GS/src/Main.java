import Models.*;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Gabriel");
        pessoa.setIdade(25);
        pessoa.setAltura(1.64);
        pessoa.falar();

        ContaBancaria minhaConta = new ContaBancaria("11111","Alex");
        minhaConta.imprimirExtrato();
        minhaConta.depositar(1000);
        minhaConta.imprimirExtrato();
        minhaConta.sacar(499);
        minhaConta.imprimirExtrato();

        Livro novoLivro = new Livro("o livro","ligma",2002);
        novoLivro.imprimirInformacoes();
        novoLivro.emprestimo();
        novoLivro.emprestimo();
        novoLivro.devolucao();
        novoLivro.devolucao();

        Calculadora calc = new Calculadora();
        calc.soma(1,2);
        calc.multiplicacao(2,4);
        calc.subtracao(5,3);
        calc.divisao(10,5);
        calc.divisao(10,0);

        Carro meuCarro = new Carro(4,"Volkswagen","Gol",2008);
        meuCarro.display();




    }
}