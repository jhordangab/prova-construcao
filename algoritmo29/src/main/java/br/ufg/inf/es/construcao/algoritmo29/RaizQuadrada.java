package br.ufg.inf.es.construcao.algoritmo29;

/**
 *
 * RaizQuadrada é a classe para a resolução do algorítmo 29, da prova de
 * Construção de Software (UFG), ministrada pelo professor Fábio Nogueira de
 * Lucena.
 *
 * @author Jhordan Gabriel
 */
public class RaizQuadrada {

    /**
     * Retorna a raiz quadrada
     *
     * @param numero
     * @param auxiliar
     *
     * @return int raizQuadrada
     *
     * @throws IllegalArgumentException Se numero for menor que 1
     *
     */
    public static int raizQuadrada(int numero, int auxiliar) {
        if (numero < 1) {
            throw new IllegalArgumentException("O número não "
                    + "pode ser menor que 'um'.");
        }

        int raizQuadrada = 1;

        while (auxiliar >= 0) {
            raizQuadrada = (raizQuadrada + numero / auxiliar) / 2;
            auxiliar--;
        }

        return raizQuadrada;
    }
}
