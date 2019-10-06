package lista01;

import java.util.Scanner;

// Programa que converte um valor em real para dólar,
// dada a cotação e o valor em reais.

public class letraJ {
    public static void main(String[] args) {
        double brl, usd, conv;
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o valor em reais: ");
        brl = sc.nextDouble();
        System.out.println("Informe a cotação do dólar: ");
        usd = sc.nextDouble();
        conv = (brl/usd);
        System.out.println("O valor em reais convertido para dólares é US$ " +conv);
    }
}
