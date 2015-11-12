package br.ufg.inf.es.construcao.algoritmo36;

public class Equacao {

    public static int equacao() {
        int auxiliarS = 0;
        int auxiliarX = 1;

        while (auxiliarX <= 96) {
            int auxiliarY = 1;
            while (auxiliarY <= 65) {
                int auxiliarZ = 1;
                while (auxiliarZ <= 39) {
                    int auxiliarW = 1;
                    while (auxiliarW <= 28) {
                        if ((2 * auxiliarX) + (3 * auxiliarY) + (5 * auxiliarZ) + (7 * auxiliarW) == 210) {
                            auxiliarS++;
                        }
                        auxiliarW++;
                    }
                    auxiliarZ++;
                }
                auxiliarY++;
            }
            auxiliarX++;
        }
        return auxiliarS;
    }
}
