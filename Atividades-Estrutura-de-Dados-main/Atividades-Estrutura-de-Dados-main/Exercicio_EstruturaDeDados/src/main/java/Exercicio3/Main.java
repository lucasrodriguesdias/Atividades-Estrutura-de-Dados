package Exercicio3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        Integer vet[] = new Integer[10];
        Integer num;

        System.out.print("Insira o valor inicial para o vetor: ");
        vet[0] = scn.nextInt();

        for(num = 1; num < 10; num++){
            vet[num] = vet[num-1] * 2;
        }

        System.out.println("Os valores do vetor sao: ");
        for(num = 0; num<10; num++){
            System.out.print(vet[num] + " ");
        }

    }
}
