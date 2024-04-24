package Exercicio5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um valor para encontrar o número de Fibonacci correspondente: ");
        int valor = scanner.nextInt();

        if (valor < 0) {
            System.out.println("O valor deve ser não negativo.");
        } else {
            long fibonacci = calcularFibonacci(valor);
            System.out.println("O número de Fibonacci correspondente é: " + fibonacci);
        }
    }
//Usar long para atender ao enunciado do exercicio (64 bits)
    public static long calcularFibonacci(int n) {
        if (n <= 1) {
            return n;
        }

        long fibAnterior = 0;
        long fibAtual = 1;

        for (int i = 2; i <= n; i++) {
            long temp = fibAtual;
            fibAtual += fibAnterior;
            fibAnterior = temp;
        }

        return fibAtual;
    }
}
