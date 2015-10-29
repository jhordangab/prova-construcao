package br.com.ufg.inf.prova.jhordan.algoritmo2;

/**
 * Classe para implementação da função diaSemana
 */
public class Paridade {

    /**
     * Verifica se número é par ou não
     *
     * @param numero
     *
     * @return boolean - true para par, false para ímpar
     *
     */
    public static boolean paridade(int numero) {
        return (numero % 2 == 0);
    }
}
