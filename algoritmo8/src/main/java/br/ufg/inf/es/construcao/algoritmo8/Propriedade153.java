package br.ufg.inf.es.construcao.algoritmo8;

public class Propriedade153 {

    public static boolean propriedade153(int numero) {
        if (numero < 0 || numero > 1000) {
            throw new IllegalArgumentException("O número informado "
                    + "precisa estar no intervalo entre 0 e 999.");
        }

        int auxiliarDiv = numero / 100;
        int auxiliarMenosDiv = ((numero - (100 * auxiliarDiv)) / 10);
        int auxiliarMod = numero % 10;

        return ((auxiliarDiv * auxiliarDiv * auxiliarDiv)
                + (auxiliarMenosDiv * auxiliarMenosDiv * auxiliarMenosDiv)
                + (auxiliarMod * auxiliarMod * auxiliarMod) == numero);
    }
}
