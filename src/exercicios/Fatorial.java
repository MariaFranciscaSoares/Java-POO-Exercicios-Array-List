package exercicios;
/*
Faça um programa que calcule o fatorial de um número inteiro fornecido
pelo usuário.
EX: 5!= 120.
 */

import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Numero: ");
        int fatorial = sc.nextInt();

        int multiplicacao = 1;

        for (int i = fatorial; i>=1 ; i--){
            multiplicacao = multiplicacao * i;
        }

        System.out.println(fatorial + "!" + " = " + multiplicacao);
    }
}
