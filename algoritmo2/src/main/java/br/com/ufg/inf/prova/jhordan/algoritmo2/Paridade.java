package br.com.ufg.inf.prova.jhordan.algoritmo2;

/**
 *
 * SomaNaturais é a classe para a resolução do algorítmo 2, da prova de
 * Construção de Software (UFG), ministrada pelo professor Fábio Nogueira de
 * Lucena.
 *
 * @author Jhordan Gabriel
 */
public class Paridade {

    /**
     * Retorna a paridade de determinado número.
     *
     * @param numero Número para teste de paridade.
     *
     * @return      <code>true</code> Caso número seja par. <code>false</code> 
     * Caso número seja ímpar.
     *
     */
    public static boolean paridade(int numero) {
        return (numero % 2 == 0);
    }
}
