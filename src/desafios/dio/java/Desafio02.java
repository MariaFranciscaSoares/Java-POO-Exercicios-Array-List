package desafios.dio.java;
/*
Entrada
A entrada consiste de uma única linha que contém dois inteiros
H e P (1 ≤ H, P ≤ 1000) indicando respectivamente o número total de coxinhas
consumidas e o número total de participantes na competição.

Saída
Seu programa deve produzir uma única linha com um número racional representando o
número médio de coxinhas consumidas pelos participantes. O resultado deve ser
escrito como um número racional com exatamente dois dígitos após o ponto decimal, arredondado se necessário.
 */

import java.util.Scanner;

public class Desafio02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int H = scan.nextInt();
        int P = scan.nextInt();

        System.out.printf("%.2f", (double)H/P);
    }
}
