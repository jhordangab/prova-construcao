package br.ufg.inf.es.construcao.algoritmo24;

public class DivideSomas {

    public static int divideSomas(int numero1, int numero2) {
        if (numero1 < 0) {
            throw new IllegalArgumentException("O primeiro número não "
                    + "pode ser menor que 'zero'.");
        }

        if (numero2 < 1) {
            throw new IllegalArgumentException("O segundo número não "
                    + "pode ser menor que 'um'.");
        }

        int auxiliarD = 0;
        int auxiliarS = numero2;

        while (auxiliarS <= numero1) {
            auxiliarS += numero2;
            auxiliarD++;
        }
        return auxiliarS;
    }
}
