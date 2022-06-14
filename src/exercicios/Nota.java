package exercicios;

import java.util.Scanner;

/* Programa que peça uma nota, entre zero e dez. Mostre uma mensagem
caso o valor seja inválido e continue até que o usuário infome o valor.

 */
public class Nota {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a nota do aluno: ");
        int nota = sc.nextInt();

        while ((nota<0) || (nota>10)){
            System.out.println("Nota inválida! Digite novamente: ");
            nota = sc.nextInt();
        }
    }
}
