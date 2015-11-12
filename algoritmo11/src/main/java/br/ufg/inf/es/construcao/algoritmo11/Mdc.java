package br.ufg.inf.es.construcao.algoritmo11;

public class Mdc {

    public static int mdc(int numero1, int numero2) {
        if (numero1 < numero2) {
            throw new IllegalArgumentException("O primeiro número"
                    + "informado não pode ser menor que o segundo");
        }

        if (numero2 < 1) {
            throw new IllegalArgumentException("O segundo número"
                    + "não pode ser menor que 'um'");
        }

        while (numero2 != 0) {
            int mod = numero1 % numero2;
            numero1 = numero2;
            numero2 = mod;
        }

        return numero1;
    }
}
