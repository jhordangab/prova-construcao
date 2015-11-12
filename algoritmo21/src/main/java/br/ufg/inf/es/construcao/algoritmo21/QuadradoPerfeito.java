package br.ufg.inf.es.construcao.algoritmo21;

public class QuadradoPerfeito {

    public static boolean quadradoPerfeito(int numero) {
        if (numero < 1) {
            throw new IllegalArgumentException("O O número não "
                    + "pode ser menor que 'um'.");
        }

        int auxiliar = 1;
        int quadradoPerfeito = 1;

        while (quadradoPerfeito < numero) {
            auxiliar += 2;
            quadradoPerfeito++;
        }
        return (quadradoPerfeito == numero);
    }
}
