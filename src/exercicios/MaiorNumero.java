package exercicios;

/*
Faça um programa que leia 5 números e informe o maior número
e a média desses números.
 */

import java.util.Scanner;

public class MaiorNumero {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero;
        int maior = 0;
        int soma = 0;

        int count = 0;
        do{
            System.out.println("Número: ");
            numero = sc.nextInt();
            soma += numero;
            if (numero > maior)
                maior = numero;
            count ++;
        }while(count<5);
        System.out.println("A maior nota foi: " + maior);
        System.out.println("Media das nota: " + (soma/5));

    }


}
