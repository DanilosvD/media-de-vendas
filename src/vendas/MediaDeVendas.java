package vendas;

import java.util.Scanner;

public class MediaDeVendas {
    public static void main(String[] args) {
        //Método para ler o teclado.
        Scanner tec = new Scanner(System.in);
        System.out.println("Se sua média de vendas for maior que R$ 2000 você receberá 10 % de gratificação!");

        System.out.println("Digite o valor vendido em janeiro: ");
        float janeiro = tec.nextFloat();

        System.out.println("Digite o valor vendido em fevereiro: ");
        float fevereiro = tec.nextFloat();

        System.out.println("Digite o valor vendido em março: ");
        float marco = tec.nextFloat();

        System.out.println("Digite o valor vendido em abril: ");
        float abril = tec.nextFloat();

        //Exibir a média de vendas.
        float media = (janeiro + fevereiro + marco + abril) / 4;

        //Condição para receber gratificação.
        if (media >= 2000) {
            System.out.println("Sua média de vendas foi  " + media + "  você receberá 10% de gratificação.");

            } else {
                System.out.println("Sua média foi  " + media + " você não atingil a meta!");
            }

        }


    }
