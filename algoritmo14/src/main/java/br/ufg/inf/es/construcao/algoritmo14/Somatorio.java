package br.ufg.inf.es.construcao.algoritmo14;

/**
 *
 * Somatorio é a classe para a resolução do algorítmo 14, da prova de
 * Construção de Software (UFG), ministrada pelo professor Fábio Nogueira de
 * Lucena.
 *
 * @author Jhordan Gabriel
 */
public class Somatorio {

    public static int somatorio(int numero) {
        if (numero < 1) {
            throw new IllegalArgumentException("O segundo número"
                    + "não pode ser menor que 'um'");
        }

        int auxiliar = 1;
        int auxiliarS = 0;

        while (auxiliar <= numero) {
            int auxiliarD = 1 + (auxiliar * auxiliar);
            auxiliarS = auxiliarS + (1 / auxiliarD);
            auxiliar++;
        }
        return auxiliarS;
    }
}
