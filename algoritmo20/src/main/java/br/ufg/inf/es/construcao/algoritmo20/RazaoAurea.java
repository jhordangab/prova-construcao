package br.ufg.inf.es.construcao.algoritmo20;

/**
 *
 * RazaoAurea é a classe para a resolução do algorítmo 20, da prova de
 * Construção de Software (UFG), ministrada pelo professor Fábio Nogueira de
 * Lucena.
 *
 * @author Jhordan Gabriel
 */
public class RazaoAurea {

    /**
     * Retorna a razão aurea
     *
     * @param termo1
     * @param termo2
     * @param fator
     *
     * @return int razao aurea
     *
     * @throws IllegalArgumentException Se o primeiro termo for menor que um, se
     * o primeiro termo for maior que segundo ou o fator maior que o segundo.
     */
    public static int razaoAurea(int termo1, int termo2, int fator) {
        if (termo1 <= 0) {
            throw new IllegalArgumentException("O primeiro termo "
                    + "não pode ser menor que 'um'.");
        }

        if (termo2 < termo1) {
            throw new IllegalArgumentException("O primeiro termo "
                    + "não pode ser maior que o segundo.");
        }

        if (fator <= 0) {
            throw new IllegalArgumentException("O fator "
                    + "não pode ser maior que o segundo.");
        }

        int termoCorrente = termo2;
        int termoAnterior = termo1;
        int auxiliar = 1;

        while (auxiliar <= fator) {
            termoCorrente += termoAnterior;
            termoAnterior = termoCorrente - termoAnterior;
            auxiliar++;
        }
        return termoCorrente / termoAnterior;
    }
}
