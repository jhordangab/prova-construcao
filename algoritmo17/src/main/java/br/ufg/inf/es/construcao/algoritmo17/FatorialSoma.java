package br.ufg.inf.es.construcao.algoritmo17;

/**
 *
 * FatorialSoma é a classe para a resolução do algorítmo 17, da prova de
 * Construção de Software (UFG), ministrada pelo professor Fábio Nogueira de
 * Lucena.
 *
 * @author Jhordan Gabriel
 */
public class FatorialSoma {
    
    /**
     * Retorna o fatorial Soma de determinado número.
     *
     * @param numero .
     *
     * @return auxiliarS Número Harmonico
     *
     * @throws IllegalArgumentException Se número for menor que um.
     *
     */
    public static int fatorialSoma(int numero){
        
        if (numero < 1) {
            throw new IllegalArgumentException("O número"
                    + "não pode ser menor que 'um'");
        }
        
        int auxiliar = 2;
        int fatorial = 1;
        
        while(auxiliar <= numero){
            fatorial = produto(fatorial, auxiliar);
            auxiliar++;
        }
        
        return fatorial;
    }
    
    /**
     * Retorna o produto de dois números infomados.
     *
     * @param numero1
     * @param numero2
     *
     * @return int soma 
     *
     * @throws IllegalArgumentException Se os números informados forem
     * negativos.
     */
    public static int produto(int numero1, int numero2) {
        if (numero1 < 0) {
            throw new IllegalArgumentException("O primeiro número informado não"
                    + "pode ser menor que zero.");
        }

        if (numero2 < 0) {
            throw new IllegalArgumentException("O segundo número informado não"
                    + "pode ser menor que zero.");
        }

        int auxiliar = 1;
        int soma = 0;

        while (auxiliar <= numero2) {
            soma += numero1;
            auxiliar++;
        }

        return soma;
    }
}
