package br.ufg.inf.es.construcao.algoritmo6;

/**
 *
 * PotenciaSoma é a classe para a resolução do algorítmo 6, da prova de
 * Construção de Software (UFG), ministrada pelo professor Fábio Nogueira de
 * Lucena.
 *
 * @author Jhordan Gabriel
 */
public class PotenciaSoma {

    /**
     * Retorna a potencia da soma de determinados numeros.
     *
     * @param numero1 Primeiro número da PotenciaSoma
     * @param numero2 Segundo número da PotenciaSoma
     *
     * @return int potencia
     *
     * @throws IllegalArgumentException Se um ou ambos os números informados
     * forem menor que 'um'.
     *
     */
    public static int potenciaSoma(int numero1, int numero2) {
        if (numero1 < 1) {
            throw new IllegalArgumentException("O primeiro número informado"
                    + " não pode ser menor que um.");
        }

        if (numero2 < 1) {
            throw new IllegalArgumentException("O segundo número informado"
                    + " não pode ser menor que um.");
        }

        int auxiliar = 1;
        int potencia = numero1;

        while (auxiliar < numero2) {
            potencia = potencia(potencia, numero1);
            auxiliar++;
        }
        return potencia;
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
}
