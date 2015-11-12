package br.ufg.inf.es.construcao.algoritmo23;

/**
 *
 * SomaDivisores é a classe para a resolução do algorítmo 23, da prova de
 * Construção de Software (UFG), ministrada pelo professor Fábio Nogueira de
 * Lucena.
 *
 * @author Jhordan Gabriel
 */
public class SomaDivisores {

    /**
     * Retorna a somaDivisores de um número
     *
     * @param numero
     *
     * @return int soma 
     *
     * @throws IllegalArgumentException Se o número for menor que um
     * 
     */
    public static int somaDivisores(int numero) {
        if (numero < 1) {
            throw new IllegalArgumentException("O O número não "
                    + "pode ser menor que 'um'.");
        }

        int auxiliarD = 2;
        int auxiliarS = 1;

        while (auxiliarD <= (numero / 2)) {
            if (mod(numero, auxiliarD) == 0) {
                auxiliarS += auxiliarD;
            }
            auxiliarD++;
        }

        return auxiliarS;
    }
    
    /**
     * Retorna o mod de dois números
     *
     * @param numero1
     * @param numero2
     *
     * @return int auxiliar
     *
     * @throws IllegalArgumentException Se o primeiro número for menor que um, e
     * se o segundo número for menor que zero.
     *
     */
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
