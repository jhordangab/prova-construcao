package br.ufg.inf.es.construcao.algoritmo16;

/**
 *
 * Fatorial é a classe para a resolução do algorítmo 16, da prova de
 * Construção de Software (UFG), ministrada pelo professor Fábio Nogueira de
 * Lucena.
 *
 * @author Jhordan Gabriel
 */
public class Fatorial {

    /**
     * Retorna o fatorial de determinado número.
     *
     * @param numero .
     *
     * @return fatorial
     *
     * @throws IllegalArgumentException Se número for menor que um.
     *
     */
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
