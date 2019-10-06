package lista01;

import java.util.Scanner;

// Programa que recebe o preço e a quantidade de determinado produto
// e calcula o valor total a ser pago.

public class letraF {
    public static void main(String[] args) {
        double valor, total;
        int quant;
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o valor do produto: ");
        valor = sc.nextDouble();
        System.out.println("Informe a quantidade: ");
        quant = sc.nextInt();
        total = valor*quant;
        System.out.println("O valor total a ser pago é R$ " +total);
    }
}
