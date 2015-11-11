package br.ufg.inf.es.construcao.algoritmo6;

public class PotenciaSoma {

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
            //potencia =
            auxiliar++;
        }
        return potencia;
    }

}
