package collection.list;

/*
Faça um programa que receba a temperatura média dos 6 primeiros meses do ano e armazene-as
em uma lista.
Após isto, calcule a média semestral das temperaturas e mostre todas as temperatura acima
desta média, e em que mês ela ocorreram Ex ( 1- janeiro)
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExercicioList01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<temperaturasSemestral> temperaturas = new ArrayList<>(){{
            int mes = 1;
            while (mes <= 6){
                System.out.println("Digite a temperatura do mês 0" + mes + ":");
                double temperatura = sc.nextDouble();
                add(new temperaturasSemestral(temperatura, mes));
                mes++;
            }
        }};

        double soma = 0;
        for(temperaturasSemestral temperatura : temperaturas){
            soma += temperatura.getTemperatura();
        }

        double media = soma/6;
        System.out.printf("Média Semestral das Temperaturas: %.2f ", media);
        System.out.println("\nTemperaturas Acima da Média Semestral: ");

        for(temperaturasSemestral temperatura : temperaturas){
            if( temperatura.getTemperatura() > media)
                System.out.println(temperatura.toString());
        }
    }
}

class temperaturasSemestral {
    private double temperatura;
    private int mes;
    public temperaturasSemestral(double temperatura, int mes) {
        this.temperatura = temperatura;
        this.mes = mes;
    }
    public Double getTemperatura() {
        return temperatura;
    }
    public int getMes() {
        return mes;
    }
    @Override
    public String toString() {
        String nomeMes = null;
        if (this.getMes() == 1)
            nomeMes = "Janeiro";
        if (this.getMes() == 2)
            nomeMes = "Fevereiro";
        if (this.getMes() == 3)
            nomeMes = "Março";
        if (this.getMes() == 4)
            nomeMes = "Abril";
        if (this.getMes() == 5)
            nomeMes = "Maio";
        if (this.getMes() == 6)
            nomeMes = "Junho";
        return "Temperatura = " + temperatura + " "
                + mes + " - " + nomeMes;
    }
}
