package lista01;

import java.util.Scanner;

// Programa que calcula o reajuste de um salário,
// dados o salário inicial e a taxa de reajuste.

public class letraH {
    public static void main(String[] args) {
        double sal, salf, perc, reaj;
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o salário inicial: ");
        sal = sc.nextDouble();
        System.out.println("Informe a taxa de reajuste (entre 0 e 1): ");
        reaj = sc.nextDouble();
        perc = sal*reaj;
        salf = perc + sal;
        System.out.println("O novo salário reajustado é igual a R$ " +salf);
    }
}
