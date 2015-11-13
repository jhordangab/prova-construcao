package br.ufg.inf.es.construcao.algoritmo35;

/**
 *
 * Luhn é a classe para a resolução do algorítmo 35, da prova de Construção de
 * Software (UFG), ministrada pelo professor Fábio Nogueira de Lucena.
 *
 * @author Jhordan Gabriel
 */
public class Luhn {

    /**
     * Luhn
     *
     * @param array
     * @param tamanho
     *
     * @return lumn
     *
     * @throws IllegalArgumentException Se o total de dígitos for menor que 2
     *
     */
    public static int luhn(int[] array, int tamanho) {
        if (tamanho < 0) {
            throw new IllegalArgumentException("O tamanho não pode ser"
                    + "menor que dois");
        }

        if (array[array.length - 1] != array[tamanho - 1]) {
            throw new IllegalArgumentException("O tamanho do array é"
                    + "diferente da quantidade de dígitos.");
        }

        int impares = 0;
        int pares = 0;
        int size = tamanho - 1;
        boolean bool = false;

        while (size > 0) {
            if (bool) {
                pares += array[size];
            } else {
                int auxiliar = array[size] * 2;
                impares += (auxiliar / 10) + mod(auxiliar, 10);
            }
            size--;
            bool = !bool;
        }
        return 10 - mod(impares + pares, 10);
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
