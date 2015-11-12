package br.ufg.inf.es.construcao.algoritmo29;

public class RaizQuadrada {

    public static int raizQuadrada(int numero, int auxiliar) {
        if (auxiliar < 1) {
            throw new IllegalArgumentException("O número não "
                    + "pode ser menor que 'um'.");
        }

        int raizQuadrada = 1;

        while (auxiliar >= 0) {
            raizQuadrada = (raizQuadrada + numero / auxiliar) / 2;
            auxiliar--;
        }

        return raizQuadrada;
    }
}
