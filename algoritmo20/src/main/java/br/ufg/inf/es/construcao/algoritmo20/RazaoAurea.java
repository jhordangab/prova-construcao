package br.ufg.inf.es.construcao.algoritmo20;

public class RazaoAurea {

    public static int razaoAurea(int termo1, int termo2, int fator) {
        if (termo1 <= 0) {
            throw new IllegalArgumentException("O primeiro termo "
                    + "não pode ser menor que 'um'.");
        }

        if (termo2 < termo1) {
            throw new IllegalArgumentException("O primeiro termo "
                    + "não pode ser maior que o segundo.");
        }

        if (fator <= 0) {
            throw new IllegalArgumentException("O fator "
                    + "não pode ser maior que o segundo.");
        }

        int termoCorrente = termo2;
        int termoAnterior = termo1;
        int auxiliar = 1;

        while (auxiliar <= fator) {
            termoCorrente += termoAnterior;
            termoAnterior = termoCorrente - termoAnterior;
            auxiliar++;
        }
        return termoCorrente / termoAnterior;
    }
}
