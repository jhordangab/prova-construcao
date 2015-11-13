package br.ufg.inf.es.construcao.algoritmo41;

/**
 *
 * InverteCaracteres é a classe para a resolução do algorítmo 41, da prova de
 * Construção de Software (UFG), ministrada pelo professor Fábio Nogueira de
 * Lucena.
 *
 * @author Jhordan Gabriel
 */
public class InverteCaracteres {

    /**
     * Inverte caracteres de determinada string
     *
     * @param string
     *
     * @return caracterInvertido
     *
     */
    public static String inverteCaracteres(String string) {
        if (string.length() == 1) {
            return string;
        } else {
            return new StringBuilder(string).reverse().toString();
        }
    }
}
