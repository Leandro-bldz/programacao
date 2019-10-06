package lista01;

import java.util.Scanner;

// Programa que retorna o nome e a idade de uma
// pessoa previamente informados.

public class letraA {
    public static void main(String[] args) {
        // char nome;
        double idade;
        Scanner scanner = new Scanner(System.in);
        //System.out.println("Informe seu nome: ");
        System.out.println("Informe sua idade: ");
        idade = scanner.nextDouble();
        System.out.println("A sua idade é " + idade);
    }

}
