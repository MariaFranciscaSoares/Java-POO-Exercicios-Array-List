
/* Criação de metodo que leia conjuntos de
dois valores, o primeiro representando o nome do aluno e o
segundo representando a sua idade. Pare inserindo valor 0 no campo
nome */

package exercicios;

import java.util.Scanner;

public class NomeIdade {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        String nome;
        int idade;

        while(true) {System.out.println("Nome: ");
            nome = sc.next();
            if(nome.equals("0")) break;
            System.out.println("Idade: ");
            idade = sc.nextInt();
        }

    }
}
