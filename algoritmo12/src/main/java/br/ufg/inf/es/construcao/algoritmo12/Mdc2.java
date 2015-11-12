package br.ufg.inf.es.construcao.algoritmo12;

/**
 *
 * Mdc2 é a classe para a resolução do algorítmo 12, da prova de
 * Construção de Software (UFG), ministrada pelo professor Fábio Nogueira de
 * Lucena.
 *
 * @author Jhordan Gabriel
 */
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
