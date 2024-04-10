package Exercicio6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        Integer[][] mat = new Integer[3][3];
        Integer i, j;
        Integer det = calcularDeterminate;

        for (i=0; i<9; i++){
            for (j=0; j<9; j++){
                System.out.print("Entre com um valor para a posição ["+i+"] ["+j+"]");
                mat[i][j] = scn.nextInt();
            }
        }
    }

    public Integer calcularDeterminante{

    }
}
