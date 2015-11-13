package br.ufg.inf.es.construcao.algoritmo39;

/**
 *
 * Propriedade é a classe para a resolução do algorítmo 39, da prova de
 * Construção de Software (UFG), ministrada pelo professor Fábio Nogueira de
 * Lucena.
 *
 * @author Jhordan Gabriel
 */
public class Propriedade {

    /**
     * retorna a propriedade
     *
     * @return propriedade
     *
     */
    public static int propriedade() {
        int propriedade = 0;
        int numero = 0;

        while (numero < 1000) {
            if (atendeSomaFatDigitos(numero)) {
                propriedade++;
            }
            numero++;
        }
        return propriedade;
    }
    
    /**
     * Verifica se atendeSomaFatDigitos
     *
     * @param numero
     *
     * @return      <code>true</code> Caso atendeSomaFatDigitos. <code>false</code>
     * Caso não atendeSomaFatDigitos;
     *
     */
    public static boolean atendeSomaFatDigitos(int numero) {
        int divN = numero / 100;
        int divB = (numero - 100 * divN) / 10;
        int modN = numero % 10;
        int soma = fatorial(divN) + fatorial(divB) + fatorial(modN);

        return (soma == numero);
    }

    /**
     * Retorna o fatorial de determinado número.
     *
     * @param numero .
     *
     * @return fatorial
     *
     * @throws IllegalArgumentException Se número for menor que um.
     *
     */
    public static int fatorial(int numero) {
        if (numero < 1) {
            throw new IllegalArgumentException("O número"
                    + "não pode ser menor que 'um'");
        }

        int auxiliar = 2;
        int fatorial = 1;

        while (auxiliar <= numero) {
            fatorial = fatorial * auxiliar;
            auxiliar++;
        }

        return fatorial;
    }
}
