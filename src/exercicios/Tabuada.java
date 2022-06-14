package exercicios;
/*
Desenvolva um gerador de tabuada,
capaz de gerar a tabuada de qualquer número inteiro entre 1 a 10.
O usuário deve informar de qual numero ele deseja ver a tabuada.
A saida deve ser conforme o exemplo abaixo:

Tabuada 5:
5 X 1 = 5
5 X 2 = 10
....
 */

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero que você deseja gerar a tabuada de 0 á 10.");
        int numero = sc.nextInt();

        System.out.println("Tabuada de " + numero);
        for (int i = 1; i<=10; i++){
            System.out.println(numero + " X " + i + " = " + (numero*i));
        }
    }
}
