package Exercicio2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        Integer vet[] = new Integer[10];
        Integer num = 0;
        float media = 0;


        for (num = 0; num < 10; num++) {
            System.out.print("Olá! Escreva o " + (num + 1) + "º número para armazenar: ");
            vet[num] = scn.nextInt();
        }

        for (num = 0; num<10; num++){
            media += vet[num];
        }
        media = media/10;

        System.out.println("A média dos valores é: "+ media);
    }
}