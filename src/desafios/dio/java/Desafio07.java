package desafios.dio.java;
/*
Você deve escrever um programa que, dados o número e o comprimento dos lados de um polígono regular,
mostre seu perímetro.

Entrada
A entrada tem dois inteiros positivos: N e L, que são, respectivamente, o número de lados e o
comprimento de cada lado de um polígono regular (3 ≤ N ≤ 1000000 and 1 ≤ L ≤ 4000).

Saída
A saída é o perímetro P do polígono regular em uma única linha.
 */

import java.util.Scanner;

public class Desafio07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int L = scan.nextInt();

        int P =  N*L;

        System.out.println(P);
    }
}
