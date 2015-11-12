package br.ufg.inf.es.construcao.algoritmo11;

/**
 *
 * Mdc é a classe para a resolução do algorítmo 11, da prova de Construção de
 * Software (UFG), ministrada pelo professor Fábio Nogueira de Lucena.
 *
 * @author Jhordan Gabriel
 */
public class Mdc {

    /**
     * Retorna o mdc de dois números
     *
     * @param numero1
     * @param numero2
     *
     * @return mdc
     *
     * @throws IllegalArgumentException Se o primeiro número for maior que
     * segundo e se o segundo número for menor que um.
     *
     */
    public static int mdc(int numero1, int numero2) {
        if (numero1 < numero2) {
            throw new IllegalArgumentException("O primeiro número "
                    + "informado não pode ser menor que o segundo");
        }

        if (numero2 < 1) {
            throw new IllegalArgumentException("O segundo número "
                    + "não pode ser menor que 'um'");
        }

        while (numero2 != 0) {
            int mod = numero1 % numero2;
            numero1 = numero2;
            numero2 = mod;
        }

        return numero1;
    }
}
