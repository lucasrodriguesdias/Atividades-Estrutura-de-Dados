package Exercicio8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite as dimensões da primeira matriz (linhas colunas):");
        int linhas1 = scanner.nextInt();
        int colunas1 = scanner.nextInt();

        System.out.println("Digite as dimensões da segunda matriz (linhas colunas):");
        int linhas2 = scanner.nextInt();
        int colunas2 = scanner.nextInt();

        if (colunas1 != linhas2) {
            System.out.println("Não é possível multiplicar as matrizes.");
            return;
        }

        System.out.println("Digite os elementos da primeira matriz:");
        int[][] matriz1 = lerMatriz(linhas1, colunas1, scanner);

        System.out.println("Digite os elementos da segunda matriz:");
        int[][] matriz2 = lerMatriz(linhas2, colunas2, scanner);

        int[][] resultado = multiplicarMatrizes(matriz1, matriz2);

        System.out.println("Resultado da multiplicação das matrizes:");
        exibirMatriz(resultado);
    }

    public static int[][] lerMatriz(int linhas, int colunas, Scanner scanner) {
        int[][] matriz = new int[linhas][colunas];
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                System.out.print("Matriz[" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }
        return matriz;
    }

    public static int[][] multiplicarMatrizes(int[][] matriz1, int[][] matriz2) {
        int linhas1 = matriz1.length;
        int colunas1 = matriz1[0].length;
        int linhas2 = matriz2.length;
        int colunas2 = matriz2[0].length;

        int[][] resultado = new int[linhas1][colunas2];

        for (int i = 0; i < linhas1; i++) {
            for (int j = 0; j < colunas2; j++) {
                for (int k = 0; k < colunas1; k++) {
                    resultado[i][j] += matriz1[i][k] * matriz2[k][j];
                }
            }
        }

        return resultado;
    }

    public static void exibirMatriz(int[][] matriz) {
        int linhas = matriz.length;
        int colunas = matriz[0].length;
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}

