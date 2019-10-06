package lista01;

import java.util.Scanner;

// Programa que calcula a área de um círculo, dado o raio.

public class letraD {
    public static void main(String[] args) {
        double raio, area;
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o raio do círculo: ");
        raio = sc.nextDouble();
        area = 3.141*raio*raio;
        System.out.println("A área do círculo é igual a " +area);

    }
}
