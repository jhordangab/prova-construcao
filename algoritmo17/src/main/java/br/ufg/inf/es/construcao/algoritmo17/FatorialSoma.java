package br.ufg.inf.es.construcao.algoritmo17;

public class FatorialSoma {
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
