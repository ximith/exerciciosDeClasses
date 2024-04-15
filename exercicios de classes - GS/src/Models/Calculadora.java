package Models;

public class Calculadora {

    public static void soma(double n1, double n2){
        System.out.println("a resposta é "+ (n1 + n2));
    }
    public static void subtracao(double n1, double n2){
        System.out.println("a resposta é "+ (n1 - n2));
    }
    public static void multiplicacao(double n1, double n2){
        System.out.println("a resposta é "+ n1*n2);
    }
    public static void divisao(double n1, double n2){
        if(n2 == 0){
            System.out.println("a resposta é "+ 0);
        }else {
            System.out.println("a resposta é "+ n1/n2);
        }
    }

}
