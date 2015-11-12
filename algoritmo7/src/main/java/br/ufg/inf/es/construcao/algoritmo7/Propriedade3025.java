package br.ufg.inf.es.construcao.algoritmo7;

/**
 *
 * Propriedade3025 é a classe para a resolução do algorítmo 7, da prova de
 * Construção de Software (UFG), ministrada pelo professor Fábio Nogueira de
 * Lucena.
 *
 * @author Jhordan Gabriel
 */
public class Propriedade3025 {

    /**
     * Retorna se número faz ou não, parte da propriedade 3025.
     *
     * @param numero Número para verificação
     *
     * @return      <code>true</code> Caso número possua a propriedade 3025.
     * <code>false</code> Caso número não possua a propriedade 3025;
     *
     *
     * @throws IllegalArgumentException Se o número informado não estiver no
     * intervalo de 0 à 9999.
     *
     */
    public static boolean propriedade3025(int numero) {
        if (numero < 0 || numero > 10000) {
            throw new IllegalArgumentException("O número informado "
                    + "precisa estar no intervalo entre 0 e 9999.");
        }

        int auxiliarDiv = numero / 100;
        int auxiliarMod = numero % 100;
        return ((auxiliarDiv + auxiliarMod) * (auxiliarDiv + auxiliarMod)
                == numero);
    }
}
