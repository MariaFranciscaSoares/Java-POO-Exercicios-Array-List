package desafios.dio.java;
/*
Entrada
A primeira linha contém um inteiro T representando o tipo de vinho (1 ≤ T ≤ 4).
A segunda linha contém cinco inteiros A, B, C, D e E, que indica a resposta dada por
cada competidor (1 ≤ A, B, C, D, E ≤ 4).

Saída
A saída contém um inteiro representando o número de concorrentes que obtiveram a resposta correta.
 */

import java.util.Scanner;

public class Desafio04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String T = sc.nextLine();
        String[] respostasCompetidores = sc.nextLine().split(" ");

        int count = 0;
        for (var competidor : respostasCompetidores) {
            if (competidor.equals(T))
                count++;
        }
        System.out.println(count);

        sc.close();
    }
}
