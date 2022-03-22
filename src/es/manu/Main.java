package es.manu;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String textico, invertido = "", texticoSinEspacios = "";
        Scanner entrada = new Scanner(System.in);
        boolean palindromo = true;

        System.out.print("Dame un textico: ");
        textico = entrada.nextLine();

        for (int i = 0; i < textico.length(); i++) {
            if (textico.charAt(i) != ' ') {
                texticoSinEspacios += textico.charAt(i);
            }
        }

        for (int i = 0; i < texticoSinEspacios.length() && palindromo; i++) {
            if (texticoSinEspacios.toLowerCase().charAt(i) != texticoSinEspacios.toLowerCase().charAt(texticoSinEspacios.length() - i - 1)) {
                palindromo = false;
            }
        }

        /*for (int i = textico.length() - 1; i >= 0 ; i--) {
            invertido += textico.charAt(i);
        }*/

        if (palindromo) {
            System.out.println("Es palindromo");
        } else {
            System.out.println("No es palindromo");
        }
    }
}
