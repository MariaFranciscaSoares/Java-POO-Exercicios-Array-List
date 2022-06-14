package exercicios;
/*
Faça um programa que peça N números inteiros,
calcule e mostre a quantidade de números pares
e a quantidade de números impares.
 */

import java.util.Scanner;

public class ParImpar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int quantidadeNumeros;
        int numero;
        int numPares = 0, numImpares = 0;

        System.out.println("Digite a quantidade de números: ");
        quantidadeNumeros = sc.nextInt();

        int count = 0;
        do {
            System.out.println("Número: ");
            numero = sc.nextInt();

            if (numero % 2 == 0)
                numPares++;
            else numImpares ++;
            count++;
        } while (count < quantidadeNumeros);

        System.out.println("Quantidade de numeros Pares: " + numPares);
        System.out.println("Quantidade de numeros Impares: " + numImpares);

    }
}
