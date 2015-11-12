package br.ufg.inf.es.construcao.algoritmo8;

/**
 *
 * Propriedade153 é a classe para a resolução do algorítmo 8, da prova de
 * Construção de Software (UFG), ministrada pelo professor Fábio Nogueira de
 * Lucena.
 *
 * @author Jhordan Gabriel
 */
public class Propriedade153 {

    /**
     * Verifica se faz ou não parte da propriedade153.
     *
     * @param numero Número para verificaçaõ.
     *
     * @return      <code>true</code> Caso número possua a propriedade 153.
     * <code>false</code> Caso número não possua a propriedade 153;
     *
     * @throws IllegalArgumentException Se o número informado, não estiver
     * dentro do intervalo entre 0 e 999
     *
     */
    public static boolean propriedade153(int numero) {
        if (numero < 0 || numero > 1000) {
            throw new IllegalArgumentException("O número informado "
                    + "precisa estar no intervalo entre 0 e 999.");
        }

        int auxiliarDiv = numero / 100;
        int auxiliarMenosDiv = ((numero - (100 * auxiliarDiv)) / 10);
        int auxiliarMod = numero % 10;

        return ((auxiliarDiv * auxiliarDiv * auxiliarDiv)
                + (auxiliarMenosDiv * auxiliarMenosDiv * auxiliarMenosDiv)
                + (auxiliarMod * auxiliarMod * auxiliarMod) == numero);
    }
}
