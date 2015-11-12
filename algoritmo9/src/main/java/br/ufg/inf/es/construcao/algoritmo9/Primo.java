package br.ufg.inf.es.construcao.algoritmo9;

/**
 *
 * Primo é a classe para a resolução do algorítmo 9, da prova de Construção de
 * Software (UFG), ministrada pelo professor Fábio Nogueira de Lucena.
 *
 * @author Jhordan Gabriel
 */
public class Primo {

    /**
     * Verifica se número é ou não, um número primo.
     *
     * @param numero Dia da data.
     *
     * @return      <code>true</code> Caso o número seja primo. 
     * <code>false</code>
     * Caso o número não seja primo.
     *
     * @throws IllegalArgumentException Se o número for menor que 2
     *
     */
    public static boolean primo(int numero) {
        if (numero < 2) {
            throw new IllegalArgumentException("O número informado "
                    + "não pode ser menor que 2");
        }

        int auxiliar = 2;

        while (auxiliar <= (numero - 1)) {
            if (numero % auxiliar == 0) {
                return false;
            }
            auxiliar++;
        }
        return true;
    }
}
