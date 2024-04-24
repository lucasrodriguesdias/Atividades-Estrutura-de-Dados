package Exercicio1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        Integer vet[] = new Integer[10];
        Integer num = 0;

        for (num = 0; num < 10; num++) {
            System.out.print("Olá! Escreva o " + (num + 1) + "º número para armazenar: ");
            vet[num] = scn.nextInt();
        }

        for (num = 0; num < 10; num++) {
            if (vet[num] % 2 == 0) {
                System.out.print(vet[num] + " ");
            }
        }

        for (num = 0; num < 10; num++) {
            if (vet[num] % 2 != 0) {
                System.out.print(vet[num] + " ");
            }
        }

    }
}
