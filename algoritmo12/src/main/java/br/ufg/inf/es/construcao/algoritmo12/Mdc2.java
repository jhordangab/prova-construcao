package br.ufg.inf.es.construcao.algoritmo12;

public class Mdc2 {

    public static int mdc2(int numero1, int numero2) {
        if (numero1 < numero2) {
            throw new IllegalArgumentException("O primeiro número"
                    + "informado não pode ser menor que o segundo");
        }

        if (numero2 < 1) {
            throw new IllegalArgumentException("O segundo número"
                    + "não pode ser menor que 'um'");
        }

        while (numero1 != numero2) {
            if (numero1 > numero2) {
                numero1 = numero1 - numero2;
            } else {
                numero2 = numero2 - numero1;
            }
        }
        return numero1;
    }
}
