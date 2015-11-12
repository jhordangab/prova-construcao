package br.ufg.inf.es.construcao.algoritmo32;

/**
 *
 * Fibonacci é a classe para a resolução do algorítmo 32, da prova de
 * Construção de Software (UFG), ministrada pelo professor Fábio Nogueira de
 * Lucena.
 *
 * @author Jhordan Gabriel
 */
public class Fibonacci {

    public static int fibonacci(int numero) {
        if (numero < 0) {
            throw new IllegalArgumentException("O número não "
                    + "pode ser menor que 'zero'.");
        }

        int anterior = 0;
        int corrente = 1;
        if (numero == 0 || numero == 1) {
            return numero;
        }

        int auxiliar = 2;

        while (auxiliar <= numero) {
            int auxiliarT = corrente;
            corrente += +anterior;
            anterior = auxiliarT;
            auxiliar++;
        }

        return corrente;
    }
}
