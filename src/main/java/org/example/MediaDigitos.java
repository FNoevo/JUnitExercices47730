package org.example;

public class MediaDigitos {
    public double mediaDosDigitos(int numero) {
        String numeroString = Integer.toString(Math.abs(numero)); // Converte o número para string, ignorando o sinal
        int soma = 0;
        int quantidadeDigitos = numeroString.length();

        for (int i = 0; i < quantidadeDigitos; i++) {
            soma += Character.getNumericValue(numeroString.charAt(i));
        }

        return (double) soma / quantidadeDigitos;
    }
}
