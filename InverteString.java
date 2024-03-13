package org.example;

public class InverteString {
    public static void main(String[] args) {
        String str = "Exemplo de string";
        String strInvertida = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            strInvertida += str.charAt(i);
        }

        System.out.println("String original: " + str);
        System.out.println("String invertida: " + strInvertida);
    }
}