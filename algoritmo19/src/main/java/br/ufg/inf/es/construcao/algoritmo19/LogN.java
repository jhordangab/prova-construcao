package br.ufg.inf.es.construcao.algoritmo19;

/**
 *
 * LogN é a classe para a resolução do algorítmo 19, da prova de
 * Construção de Software (UFG), ministrada pelo professor Fábio Nogueira de
 * Lucena.
 *
 * @author Jhordan Gabriel
 */
public class LogN {

    public static int logN(int numero, int log) {
        if (numero < 1) {
            throw new IllegalArgumentException("O número"
                    + "não pode ser menor que 'um'");
        }

        if (log < 2) {
            throw new IllegalArgumentException("O log"
                    + "não pode ser menor que 'um'");
        }

        int auxiliar = 2;
        int auxiliarE = numero++;
        int auxiliarT = numero;

        while (auxiliar <= log) {
            auxiliarT = auxiliarT * numero / auxiliar;
            auxiliarE += auxiliarT;
            auxiliar++;
        }

        return auxiliarE;
    }
}
