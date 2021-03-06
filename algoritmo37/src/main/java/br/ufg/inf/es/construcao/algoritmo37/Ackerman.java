package br.ufg.inf.es.construcao.algoritmo37;

/**
 *
 * Ackerman é a classe para a resolução do algorítmo 37, da prova de Construção
 * de Software (UFG), ministrada pelo professor Fábio Nogueira de Lucena.
 *
 * @author Jhordan Gabriel
 */
public class Ackerman {

    /**
     * Ackerman
     *
     * @param numero1
     * @param numero2
     *
     * @return ackerman
     *
     * @throws IllegalArgumentException Se o número1 e/ou número2 forem
     * negativos.
     *
     */
    public static int ackerman(int numero1, int numero2) {
        if (numero1 < 0) {
            throw new IllegalArgumentException("O primeiro número não "
                    + "pode ser menor que 'zero'.");
        }

        if (numero2 < 0) {
            throw new IllegalArgumentException("O segundo número não "
                    + "pode ser menor que 'zero'.");
        }

        if (numero1 == 0) {
            return numero2 + 1;
        }

        if (numero2 == 0) {
            return ackerman(numero1 - 1, 1);
        }

        return ackerman(numero1 - 1, ackerman(numero1, numero2 - 1));
    }
}
