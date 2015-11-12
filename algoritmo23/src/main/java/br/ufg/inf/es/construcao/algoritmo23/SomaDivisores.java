package br.ufg.inf.es.construcao.algoritmo23;

public class SomaDivisores {

    public static int somaDivisores(int numero) {
        if (numero < 1) {
            throw new IllegalArgumentException("O O número não "
                    + "pode ser menor que 'um'.");
        }

        int auxiliarD = 2;
        int auxiliarS = 1;

        while (auxiliarD <= (numero / 2)) {
            if (mod(numero, auxiliarD) == 0) {
                auxiliarS += auxiliarD;
            }
            auxiliarD++;
        }

        return auxiliarS;
    }
    
    public static int mod(int numero1, int numero2) {
        if (numero1 < 1) {
            throw new IllegalArgumentException("O primeiro número não pode ser"
                    + " menor que 1");
        }

        if (numero2 < 0) {
            throw new IllegalArgumentException("O segundo número não pode ser"
                    + " menor que zero");
        }

        int auxiliar = numero1;

        while (auxiliar >= numero2) {
            auxiliar = auxiliar - numero2;
        }

        return auxiliar;
    }
}
