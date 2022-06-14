package exercicios;
/*
Crie um vetor de 6 números inteiros
e mostre-os na ordem inversa.
*/

public class OrdemInversa {
    public static void main(String[] args) {

        int[] vetor = {10, -8, 6, 2, 17, 1};

        System.out.println(vetor.length); //retorna tamanho do vetor.

        System.out.print("Vetor: ");
        int count = 0;
        while (count < (vetor.length)){
            System.out.print(vetor[count] + " ");
            count++;
        }

        System.out.print("\nVetor na Ordem Inversa: ");
        for (int i = (vetor.length -1); i>=0; i--){
            System.out.print(vetor[i] + " ");
        }
    }
}
