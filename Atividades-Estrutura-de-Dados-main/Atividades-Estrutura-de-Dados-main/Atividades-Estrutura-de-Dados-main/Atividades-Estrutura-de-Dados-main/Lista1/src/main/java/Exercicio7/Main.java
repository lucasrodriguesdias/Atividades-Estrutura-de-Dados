package Exercicio7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número inteiro no intervalo de 2 a 5: ");
        int n = scanner.nextInt();

        if (n < 2 || n > 5) {
            System.out.println("O número digitado está fora do intervalo permitido.");
            return;
        }

        int[][] matriz = new int[n][n];

        int valor = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matriz[i][j] = valor++;
            }
        }

        int[][] quadradoMatriz = calcularQuadradoMatriz(matriz);

        System.out.println("Matriz original:");
        exibirMatriz(matriz);
        System.out.println("\nQuadrado da matriz:");
        exibirMatriz(quadradoMatriz);
    }

    public static int[][] calcularQuadradoMatriz(int[][] matriz) {
        int n = matriz.length;
        int[][] quadradoMatriz = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    quadradoMatriz[i][j] += matriz[i][k] * matriz[k][j];
                }
            }
        }

        return quadradoMatriz;
    }
    public static void exibirMatriz(int[][] matriz) {
        int n = matriz.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
