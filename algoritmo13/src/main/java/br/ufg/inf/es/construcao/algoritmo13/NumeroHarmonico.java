package br.ufg.inf.es.construcao.algoritmo13;

public class NumeroHarmonico {

    public static int numeroHarmonico(int numero) {
        if (numero < 1) {
            throw new IllegalArgumentException("O número"
                    + "não pode ser menor que 'um'");
        }

        int auxiliar = 2;
        int auxiliarS = 1;

        while (auxiliar <= numero) {
            auxiliarS = auxiliarS + (1 / auxiliar);
            auxiliar++;
        }

        return auxiliarS;
    }
}
