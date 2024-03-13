package Exercises;

import java.util.Random;
import java.util.Scanner;

public class Exerc02_Sorteador {
    public static void main(String[] args) {
        int tentativas = 10;
        Scanner palpite = new Scanner(System.in);
        int numeroSorteado = new Random().nextInt(100);
        //System.out.println(numeroSorteado);

        System.out.println("Acha que consegue adivinhar o número sorteado entre 1 a 100? você tem " + tentativas + " tentativas");
        int chute = palpite.nextInt();
        tentativas--;

        while (chute != numeroSorteado){

            if (chute > numeroSorteado){System.out.println("O número sorteado é menor do que o seu palpite!");}
            else {System.out.println("O número sorteado é maior do que o seu palpite!");}

            System.out.println("Acha que consegue adivinhar o número sorteado? você tem " + tentativas + " tentativas");
            chute = palpite.nextInt();
            tentativas--;

            if (tentativas == 0) {break;}
        }

        if (tentativas > 0) {System.out.println("Parabéns, acertou!");}
        else {System.out.println("Tentativas excedidas, você falhou!");}
    }
}
