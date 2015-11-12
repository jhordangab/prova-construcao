package br.ufg.inf.es.construcao.algoritmo15;

public class Pi {

    public static int pi(int numero) {
        if (numero < 1) {
            throw new IllegalArgumentException("O número"
                    + "não pode ser menor que 'um'");
        }

        int auxiliar = 1;
        int auxiliarS = -1;
        int auxiliarD = -1;
        int pi = 0;

        while (auxiliar <= numero) {
            auxiliarD += 2;
            auxiliarS = -1 * auxiliarS;
            pi += 4 * auxiliarS / auxiliarD;
            auxiliar++;
        }
        return pi;
    }
}
