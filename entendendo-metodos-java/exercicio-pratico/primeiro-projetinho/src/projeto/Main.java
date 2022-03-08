package projeto;

public class Main {
    public static void main(String[] args) {

        System.out.println("calculadora");
        CALCULADORA.soma(2, 4);
        CALCULADORA.subtracao(5, 5);
        CALCULADORA.multiplicacao(6, 6);
        CALCULADORA.divisao(12, 6);

        System.out.println("mensagem de hora");
        mensagem.obterMensagem(4);
        mensagem.obterMensagem(15);
        mensagem.obterMensagem(7);
        mensagem.obterMensagem(16);
        
        System.out.println("emprestimo");
        emprestimo.calcular(1000, 2);
        emprestimo.calcular(2000, 3);
        emprestimo.calcular(3000, 4);
    }

}
