package Exercicio6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        Integer[][] mat = new Integer[3][3];
        Integer i, j;

        for (i=0; i<9; i++){
            for (j=0; j<9; j++){
                System.out.print("Entre com um valor para a posição ["+i+"] ["+j+"]: ");
                mat[i][j] = scn.nextInt();
            }
        }

        Integer det = calcularDeterminante(mat);
        System.out.println("O determinante da matriz é: " + det);

    }

    public static Integer calcularDeterminante(Integer[][] mat) {
        int determinante = 0;

        determinante += mat[0][0] * (mat[1][1] * mat[2][2] - mat[1][2] * mat[2][1]);
        determinante -= mat[0][1] * (mat[1][0] * mat[2][2] - mat[1][2] * mat[2][0]);
        determinante += mat[0][2] * (mat[1][0] * mat[2][1] - mat[1][1] * mat[2][0]);

        return determinante;
    }
}
