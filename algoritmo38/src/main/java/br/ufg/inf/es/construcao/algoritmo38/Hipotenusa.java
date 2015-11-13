package br.ufg.inf.es.construcao.algoritmo38;

/**
 *
 * Hipotenusa é a classe para a resolução do algorítmo 38, da prova de
 * Construção de Software (UFG), ministrada pelo professor Fábio Nogueira de
 * Lucena.
 *
 * @author Jhordan Gabriel
 */
public class Hipotenusa {

    /**
     * Retorna a hipotenusa de dois números.
     *
     * @param lado1
     * @param lado2
     *
     * @return hipotenusa
     *
     */
    public static int hipotenusa(int lado1, int lado2) {
        int ladoX = lado1 * lado1;
        int ladoY = lado2 * lado2;
        int hipotenusa = raizQuadrada(ladoX, ladoY);

        return hipotenusa;
    }

    /**
     * Retorna a raiz quadrada
     *
     * @param numero
     * @param auxiliar
     *
     * @return int raizQuadrada
     *
     * @throws IllegalArgumentException Se auxiliar for menor que 1
     *
     */
    public static int raizQuadrada(int numero, int auxiliar) {
        if (numero < 1) {
            throw new IllegalArgumentException("O número não "
                    + "pode ser menor que 'um'.");
        }

        int raizQuadrada = 1;

        while (auxiliar > 0) {
            raizQuadrada = (raizQuadrada + numero / auxiliar) / 2;
            auxiliar--;
        }

        return raizQuadrada;
    }
}
