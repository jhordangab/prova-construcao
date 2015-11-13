package br.ufg.inf.es.construcao.algoritmo34;

/**
 *
 * Cpf é a classe para a resolução do algorítmo 34, da prova de Construção de
 * Software (UFG), ministrada pelo professor Fábio Nogueira de Lucena.
 *
 * @author Jhordan Gabriel
 */
public class Cpf {

    /**
     * Retorna a validade de um cpf
     *
     * @param cpf
     *
     * @return      <code>true</code> Caso Cpf está válido. <code>false</code> Caso
     * Cpf está inválido.
     *
     * @throws IllegalArgumentException Se cpf não tem 11 dígitos
     *
     */
    public static boolean cpf(int[] cpf) {
        if (cpf.length != 11) {
            throw new IllegalArgumentException("A quantidade de dígitos"
                    + " não pode ser diferente de 11");
        }

        int c = 8;
        int p = cpf[9];
        int s = cpf[9];

        while (c >= 1) {
            p += cpf[c];
            s += p;
            c--;
        }

        int j = mod(mod(s, 11), 10);
        int k = mod(mod(s - p + 9 * j, 11), 10);

        return (j == cpf[10] && k == cpf[11]);

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
}
