package br.ufg.inf.es.construcao.algoritmo42;

/**
 *
 * SomaNaturais é a classe para a resolução do algorítmo 42, da prova de
 * Construção de Software (UFG), ministrada pelo professor Fábio Nogueira de
 * Lucena.
 *
 * @author Jhordan Gabriel
 */
public class SomaNaturais {

    /**
     * Retorna a soma dos naturais de um números
     *
     * @param numero
     *
     * @return soma
     *
     */
    public static int somaNaturais(int numero) {
        if (numero < 1) {
            throw new IllegalArgumentException("O número não pode ser "
                    + "menor que um");
        }
        
        return (numero == 1) ? 1 : somaNaturais(numero - 1) + numero;
    }
}
