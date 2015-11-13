package br.ufg.inf.es.construcao.algoritmo28;

/**
 *
 * Divide é a classe para a resolução do algorítmo 28, da prova de Construção de
 * Software (UFG), ministrada pelo professor Fábio Nogueira de Lucena.
 *
 * @author Jhordan Gabriel
 */
public class Divide {

    /**
     * Imprime determinadas strings
     *
     * @param a
     * @param b
     * @param k
     *
     * @throws IllegalArgumentException a e/ou b não pode ser menor que um.
     *
     */
    public static void divide(int a, int b, int k) {
        if (a < 1) {
            throw new IllegalArgumentException("O primeiro número não pode ser"
                    + " menor que zero");
        }

        if (b < 1) {
            throw new IllegalArgumentException("O segundo número não pode ser"
                    + " menor que zero");
        }

        int d = divideSomas(a, b);
        System.out.println(d);

        int r = mod(a, b);

        if (r != 0) {
            System.out.println(",");
        }

        while (r != 0 && k > 0) {
            r = produto(10, r);
            d = divideSomas(r, b);
            System.out.println(d);
            r = mod(r, b);
            k = k - 1;
        }
    }

    /**
     * Retorna o produto de dois números infomados.
     *
     * @param numero1
     * @param numero2
     *
     * @return int soma
     *
     * @throws IllegalArgumentException Se os números informados forem
     * negativos.
     */
    public static int produto(int numero1, int numero2) {
        if (numero1 < 0) {
            throw new IllegalArgumentException("O primeiro número informado não"
                    + "pode ser menor que zero.");
        }

        if (numero2 < 0) {
            throw new IllegalArgumentException("O segundo número informado não"
                    + "pode ser menor que zero.");
        }

        int auxiliar = 1;
        int soma = 0;

        while (auxiliar <= numero2) {
            soma += numero1;
            auxiliar++;
        }

        return soma;
    }

    /**
     * Retorna o mod de dois números
     *
     * @param numero1
     * @param numero2
     *
     * @return int auxiliar
     *
     * @throws IllegalArgumentException Se o primeiro número for menor que um, e
     * se o segundo número for menor que zero.
     *
     */
    public static int mod(int numero1, int numero2) {
        if (numero1 < 1) {
            throw new IllegalArgumentException("O primeiro número não pode ser"
                    + " menor que 1");
        }

        if (numero2 < 0) {
            throw new IllegalArgumentException("O segundo número não pode ser"
                    + " menor que zero");
        }

        int auxiliar = numero1;

        while (auxiliar >= numero2) {
            auxiliar = auxiliar - numero2;
        }

        return auxiliar;
    }

    /**
     * Retorna o divideSoma de dois números
     *
     * @param numero1
     * @param numero2
     *
     * @return int auxiliarS
     *
     * @throws IllegalArgumentException Se o primeiro número for negativo, e se
     * o segundo número for menor que um.
     *
     */
    public static int divideSomas(int numero1, int numero2) {
        if (numero1 < 0) {
            throw new IllegalArgumentException("O primeiro número não "
                    + "pode ser menor que 'zero'.");
        }

        if (numero2 < 1) {
            throw new IllegalArgumentException("O segundo número não "
                    + "pode ser menor que 'um'.");
        }

        int auxiliarD = 0;
        int auxiliarS = numero2;

        while (auxiliarS <= numero1) {
            auxiliarS += numero2;
            auxiliarD++;
        }
        return auxiliarS;
    }
}
