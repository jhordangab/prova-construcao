package br.ufg.inf.es.construcao.algoritmo27;

/**
 *
 * Mod é a classe para a resolução do algorítmo 27, da prova de
 * Construção de Software (UFG), ministrada pelo professor Fábio Nogueira de
 * Lucena.
 *
 * @author Jhordan Gabriel
 */
public class Mod {

    public static int mod(int numero1, int numero2) {
        if (numero1 < 1) {
            throw new IllegalArgumentException("O primeiro número não pode ser"
                    + " menor que 1");
        }

        if (numero2 < 0) {
            throw new IllegalArgumentException("O segundo número não pode ser"
                    + " menor que zero");
        }

        int auxiliar = numero1;

        while (auxiliar >= numero2) {
            auxiliar = auxiliar - numero2;
        }

        return auxiliar;
    }
}
