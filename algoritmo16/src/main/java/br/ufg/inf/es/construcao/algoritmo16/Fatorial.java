package br.ufg.inf.es.construcao.algoritmo16;

public class Fatorial {

    public static int fatorial(int numero) {
        if (numero < 1) {
            throw new IllegalArgumentException("O número"
                    + "não pode ser menor que 'um'");
        }

        int auxiliar = 2;
        int fatorial = 1;

        while (auxiliar <= numero) {
            fatorial = fatorial * auxiliar;
            auxiliar++;
        }

        return fatorial;
    }
}
