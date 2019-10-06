package lista01;

import java.util.Scanner;

// Programa que calcula a comissão de um vendedor,
// dado um valor total de vendas (10% de comissão).

public class letraE {
    public static void main(String[] args) {
        double vend, com;
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o valor total das vendas: ");
        vend = sc.nextDouble();
        com = 0.1*vend;
        System.out.println("O valor da comissão do vendedor é igual a " +com);
    }
}
