package lista01;

import java.util.Scanner;

// Programa que calcula a área de um triângulo, dados base e altura.

public class letraC {
    public static void main(String[] args) {
        double base, altura, area;
        Scanner a = new Scanner(System.in);
        System.out.println("Informe a base do triângulo: ");
        base = a.nextDouble();
        System.out.println("Informe a altura do triângulo: ");
        altura = a.nextDouble();
        area = base*altura/2;
        System.out.println("A área do triângulo é igual a " +area);
    }
}
