package br.ufg.inf.es.construcao.algoritmo37;

public class Ackerman {

    public static int ackerman(int numero1, int numero2) {
        if (numero1 < 0) {
            throw new IllegalArgumentException("O primeiro número não "
                    + "pode ser menor que 'zero'.");
        }

        if (numero2 < 0) {
            throw new IllegalArgumentException("O segundo número não "
                    + "pode ser menor que 'zero'.");
        }

        if (numero1 == 0) {
            return numero2 + 1;
        }

        if (numero2 == 0) {
            return ackerman(numero1 - 1, 1);
        }

        return ackerman(numero1 - 1, ackerman(numero1, numero2 - 1));
    }
}
