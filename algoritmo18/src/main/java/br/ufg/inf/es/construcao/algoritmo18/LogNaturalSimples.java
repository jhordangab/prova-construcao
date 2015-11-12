package br.ufg.inf.es.construcao.algoritmo18;

/**
 *
 * LogNaturalSimples é a classe para a resolução do algorítmo 18, da prova de
 * Construção de Software (UFG), ministrada pelo professor Fábio Nogueira de
 * Lucena.
 *
 * @author Jhordan Gabriel
 */
public class LogNaturalSimples {

    /**
     * Retorna log natural simples de um numero
     *
     * @param numero
     * @param log
     *
     * @return int soma 
     *
     * @throws IllegalArgumentException Se o número informado for menor que 1,
     * ou se o log informado for menor que 2.
     * 
     */
    public static int logNaturalSimples(int numero, int log) {
        if (numero < 1) {
            throw new IllegalArgumentException("O número"
                    + "não pode ser menor que 'um'");
        }

        if (log < 2) {
            throw new IllegalArgumentException("O log"
                    + "não pode ser menor que 'dois'");
        }

        int auxiliar = 2;
        int auxiliarE = numero++;

        while (auxiliar <= log) {
            int potencia = potencia(numero, auxiliar);
            int fatorial = fatorial(auxiliar);
            auxiliarE += potencia / fatorial;
            auxiliar++;
        }
        return auxiliarE;
    }

    /**
     * Retorna a soma dos números naturais de determinado número.
     *
     * @param base Base da potência desejada.
     * @param expoente Expoente da potência desejada.
     *
     * @return int potencia
     *
     * @throws IllegalArgumentException Se a base for menor que 'um' e/ou
     * expoente for um número negativo.
     *
     */
    public static int potencia(int base, int expoente) {

        if (base < 1) {
            throw new IllegalArgumentException("O base informada não pode ser "
                    + "menor que um.");
        }

        if (expoente < 0) {
            throw new IllegalArgumentException("O expoente informado não pode"
                    + " ser menor que zero.");
        }

        int auxiliar = 1;
        int potencia = 1;

        while (auxiliar <= expoente) {
            potencia *= base;
            auxiliar++;
        }
        return potencia;
    }

    /**
     * Retorna o fatorial de determinado número.
     *
     * @param numero .
     *
     * @return fatorial
     *
     * @throws IllegalArgumentException Se número for menor que um.
     *
     */
    public static int fatorial(int numero) {
        if (numero < 1) {
            throw new IllegalArgumentException("O número"
                    + "não pode ser menor que 'um'");
        }

        int auxiliar = 2;
        int fatorial = 1;

        while (auxiliar <= numero) {
            fatorial = fatorial * auxiliar;
            auxiliar++;
        }

        return fatorial;
    }
}
