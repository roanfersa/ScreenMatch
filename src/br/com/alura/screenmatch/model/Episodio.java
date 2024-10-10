package br.com.alura.screenmatch.model;

import calculadora.Classificavel;

public class Episodio  implements Classificavel {
   private int totalVisualizacoes;








    @Override
    public int getClassificacao() {
        if (totalVisualizacoes > 100) {
            return 4;
        } else {
            return 2;

        }
    }
}
