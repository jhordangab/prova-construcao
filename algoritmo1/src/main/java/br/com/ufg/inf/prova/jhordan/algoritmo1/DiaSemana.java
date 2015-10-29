package br.com.ufg.inf.prova.jhordan.algoritmo1;

/**
 * Classe para implementação da função diaSemana
 */
public class DiaSemana {

    /**
     * Obtém o dia da semana de uma dada data.
     *
     * @param dia
     * @param mes
     * @param ano
     *
     * @return O valor correspondente ao dia da semana informado
     *
     */
    public static int diaSemana(int dia, int mes, int ano) {

        if (dia < 1 || dia > 31) {
            throw new IllegalArgumentException("O dia informado é inválido.");
        }

        if (mes < 1 || mes > 12) {
            throw new IllegalArgumentException("O mês informado é inválido.");
        }

        if (ano < 1753) {
            throw new IllegalArgumentException("O ano informado é inválido.");
        }

        if (mes == 1 || mes == 2) {
            mes = mes + 12;
            ano = ano - 1;
        }

        int diaSemana = dia + 2 * mes + (3 * (mes + 1) / 5) + ano + ano / 4
                - ano / 100 + ano / 400;

        return diaSemana % 7;

    }
}
