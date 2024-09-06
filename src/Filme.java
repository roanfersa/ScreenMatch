public class Filme {
    String nome;
    int anoDeLancamento;
    int duracaoEmMinutos;
    int somaDasAvaliacoes;
    int totalDeAvaliacoes;
    boolean incluidoNoPlano;


    void exibeFichaTecnica() {
        System.out.println("Nome: " + nome);
        System.out.println("Ano de lancamento: " + anoDeLancamento);
        System.out.println("Duraçao em minutos: " + duracaoEmMinutos);
        System.out.println("Incluido no plano: " + incluidoNoPlano);
    }

    void avalia(double nota) {
        somaDasAvaliacoes += nota;
        totalDeAvaliacoes++;

    }

    double pegaMedia() {
        return somaDasAvaliacoes / totalDeAvaliacoes;

    }
}
