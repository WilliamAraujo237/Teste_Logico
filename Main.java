package org.example;

public class Main {
    public static void main(String[] args) {
        // Número de termos da sequência de Fibonacci a serem exibidos
        int n = 10;

        // Modificando o valor de A, você determina qual o numeor a sequencia terá inicio
        int a = 0, b = a + 1, c;

        // Variavel para identificar se o numero percence a sequancia
        int num = 4;

        // Identificador
        boolean SequenciaFibonacci = false;

        System.out.println("Sequência de Fibonacci:");
        for (int i = 1; i <= n; ++i) {
            System.out.print(a + " ");
            c = a + b;
            a = b;
            b = c;

            if (num == c){
                SequenciaFibonacci = true;
            }
        }


        if (SequenciaFibonacci) {
            System.out.println("\nO número " + num + " faz parte da sequência de Fibonacci.");
        } else {
            System.out.println("\nO número " + num + " não faz parte da sequência de Fibonacci.");
        }
    }
}