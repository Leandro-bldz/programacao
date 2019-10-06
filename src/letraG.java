package lista01;

import java.util.Scanner;

// Programa que calcula a área de uma sala,
// dados o comprimento e a largura desta.

public class letraG {
    public static void main(String[] args) {
        double comp, larg, area;
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o valor do comprimento da sala (em metros): ");
        comp = sc.nextDouble();
        System.out.println("Informe o valor da largura da sala (em metros): ");
        larg = sc.nextDouble();
        area = comp*larg;
        System.out.println("A área da sala em m² é igual a " +area);
    }
}
