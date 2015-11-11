package br.com.ufg.inf.prova.jhordan.algoritmo1;

/**
 *
 * SomaNaturais é a classe para a resolução do algorítmo 1, da prova de
 * Construção de Software (UFG), ministrada pelo professor Fábio Nogueira de
 * Lucena.
 *
 * @author Jhordan Gabriel
 */
public class DiaSemana {

    /**
     * Retorna o dia da semana de determinada data.
     *
     * @param dia Dia da data.
     * @param mes Mês da data.
     * @param ano Ano da data.
     *
     * @return      <code>0</code> Dia da semana referente à segunda-feira.
     * <code>1</code> Dia da semana referente à terça-feira. <code>2</code> Dia
     * da semana referente à quarta-feira. <code>3</code> Dia da semana
     * referente à quinta-feira. <code>4</code> Dia da semana referente à
     * sexta-feira. <code>5</code> Dia da semana referente à sábado.
     * <code>6</code> Dia da semana referente à domingo.
     *
     * @throws IllegalArgumentException Se o data informada for inválida, ou
     * seja, se o dia não estiver entre 1 e 31, o mês não estiver entre 1 e 12
     * (Janeiro à Dezembro) e o ano não for maior que 1973.
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
