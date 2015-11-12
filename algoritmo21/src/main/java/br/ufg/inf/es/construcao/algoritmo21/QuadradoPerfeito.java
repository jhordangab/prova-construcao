package br.ufg.inf.es.construcao.algoritmo21;

/**
 *
 * QuadradoPerfeito é a classe para a resolução do algorítmo 21, da prova de
 * Construção de Software (UFG), ministrada pelo professor Fábio Nogueira de
 * Lucena.
 *
 * @author Jhordan Gabriel
 */
public class QuadradoPerfeito {

    /**
     * Verifica se um número é quadrado perfeito
     *
     * @param numero
     *
     * @return      <code>true</code> Caso seja um quadrado perfeito
     * <code>false</code> Caso não seja um quadrado perfeito
     *
     *
     * @throws IllegalArgumentException Se o número informado for negativo
     *
     */
    public static boolean quadradoPerfeito(int numero) {
        if (numero < 1) {
            throw new IllegalArgumentException("O número não "
                    + "pode ser menor que 'um'.");
        }

        int auxiliar = 1;
        int quadradoPerfeito = 1;

        while (quadradoPerfeito < numero) {
            auxiliar += 2;
            quadradoPerfeito += auxiliar;
        }
        return (quadradoPerfeito == numero);
    }
}
