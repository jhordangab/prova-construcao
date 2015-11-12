package br.ufg.inf.es.construcao.algoritmo18;

public class LogNaturalSimples {

    public static int logNaturalSimples(int numero, int log) {
        if (numero < 1) {
            throw new IllegalArgumentException("O número"
                    + "não pode ser menor que 'um'");
        }

        if (log < 2) {
            throw new IllegalArgumentException("O log"
                    + "não pode ser menor que 'um'");
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
