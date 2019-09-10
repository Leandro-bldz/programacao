import java.util.Scanner;

public class Lista1Questao2 {
    public static void main(String[] args) {
    double numero;
    double dobro;
    Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o numero: ");
    numero = scanner.nextDouble();
    dobro = numero * 2;
        System.out.println("O dobro do numero é: " + dobro);
    }
}
