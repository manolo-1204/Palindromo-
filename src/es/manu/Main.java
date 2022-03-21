package es.manu;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String textico, invertido = "";
        Scanner entrada = new Scanner(System.in);
        boolean palindromo = false;

        System.out.print("Dame un textico ");
        textico = entrada.nextLine();

        for (int i = 0; i < textico.length(); i++) {
            invertido.charAt(invertido.length() - 1 - i) = textico.charAt(i);
        }
    }
}
