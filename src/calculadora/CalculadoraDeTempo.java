package calculadora;

import br.com.alura.screenmatch.model.Titulo;

public class CalculadoraDeTempo {

    private int tempoTotal;


    public void inclui (Titulo titulo) {
        tempoTotal += titulo.getDuracaoEmMinutos();
    }

    public int getTempoTotal() {
        return tempoTotal;
    }
}
