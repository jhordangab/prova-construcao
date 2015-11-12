package br.ufg.inf.es.construcao.algoritmo9;

public class Primo {

    public static boolean primo(int numero) {
        if (numero < 2) {
            throw new IllegalArgumentException("O número informado "
                    + "não pode ser menor que 2");
        }

        int auxiliar = 2;

        while (auxiliar <= (numero - 1)) {
            if (numero % auxiliar == 0) {
                return false;
            }
            auxiliar++;
        }
        return true;
    }
}
