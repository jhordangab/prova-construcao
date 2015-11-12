package br.ufg.inf.es.construcao.algoritmo38;

public class Hipotenusa {

    public static int hipotenusa(int lado1, int lado2) {
        int ladoX = lado1 * lado1;
        int ladoY = lado2 * lado2;
        int hipotenusa = raizQuadrada(ladoX, ladoY);

        return hipotenusa;
    }

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
