package Exercicio4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        Float vet[] = new Float[100];
        Integer num;

        System.out.print("Insira o primeiro valor do vetor: ");
        vet[0] = scn.nextFloat();

        for (num = 1; num < 100; num++){
            vet[num] = vet[num-1] / 2;
        }

        System.out.println("Os valores do vetor sao: ");
        for(num = 0; num < 100; num++){
            System.out.println(vet[num]+" ");
        }
    }
}
