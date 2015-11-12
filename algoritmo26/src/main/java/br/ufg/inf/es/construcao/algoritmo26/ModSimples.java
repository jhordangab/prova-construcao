package br.ufg.inf.es.construcao.algoritmo26;

public class ModSimples {

    public static int modSimples(int numero1, int numero2) {
        if (numero1 < 1) {
            throw new IllegalArgumentException("O primeiro número não "
                    + "pode ser menor que 'um'.");
        }

        if (numero2 < 1) {
            throw new IllegalArgumentException("O segundo número não "
                    + "pode ser menor que 'um'.");
        }

        int auxiliarD = divideSubtracoes(numero1, numero2);

        return numero1 - (auxiliarD * numero2);
    }

    public static int divideSubtracoes(int numero1, int numero2) {
        if (numero1 < 0) {
            throw new IllegalArgumentException("O primeiro número não "
                    + "pode ser menor que 'zero'.");
        }

        if (numero2 < 1) {
            throw new IllegalArgumentException("O segundo número não "
                    + "pode ser menor que 'um'.");
        }

        int auxiliarD = 0;
        int auxiliarS = numero1;

        while (auxiliarS <= numero2) {
            auxiliarS = auxiliarS - numero2;
            auxiliarD++;
        }
        return auxiliarD;
    }
}
