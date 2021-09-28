package com.codebox;

import java.util.Scanner;

public class MediaEscolar {

    public static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {

        // meu codigo faz o calculo da media escolar
        System.out.println(" ===== PROGRAMA MEDIA ===== \n");
        double nota1, nota2, media;  // numero inteiro

        System.out.println("DIGITE A PRIMEIRA NOTA: \n");
        nota1 = Double.parseDouble(keyboard.nextLine());

        System.out.println("DIGITE A SEGUNDA NOTA: \n");
        nota2 = Double.parseDouble(keyboard.nextLine());

        // atribuindo o resultado do calculo da media
        media = (nota1 + nota2) / 2;
        System.out.println("A media das notas é: " + media); // CONCATENAÇÃO

    }
}
