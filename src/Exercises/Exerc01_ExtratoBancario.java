package Exercises;

import java.util.Scanner;

public class Exerc01_ExtratoBancario {
    public static void main(String[] args) {

        float Saldo = 1825;
        String Titular = new String("Humberto");
        Scanner opcaoSelecionada = new Scanner(System.in);
        float ValorTransf = 0;
        Scanner operacaoValores = new Scanner(System.in);

        System.out.println(
                " // Olá  " + Titular + "\n"
                        + " // O seu saldo atual é de: " + Saldo + "\n"
        );

        System.out.println("Deseja acessar o menu? digite 1 para sim e 2 para não");
        int menuOption_int = opcaoSelecionada.nextInt();

        if (menuOption_int == 1) {
            System.out.println("Carregando Menu....");
            System.out.println("Sistemas inicializados...." + "\n");
            System.out.println("//Menu de Acesso" + "\n");
            System.out.println("""
                    Tecla 1 ----- Consultar Saldo;
                    Tecla 2 ----- Realizar Transferencia;
                    Tecla 3 ----- Deposito em conta;
                    Tecla 4 ----- SAIR
                    
                    Selecione uma opção para prosseguir
                    """);
            menuOption_int = opcaoSelecionada.nextInt();
            switch (menuOption_int)
            {
                case 1:
                    System.out.println(Titular + " o seu saldo é de: " + Saldo);
                    break;
                case 2:
                    System.out.println("Insira o valor da transferencia: ");
                    ValorTransf = operacaoValores.nextFloat();
                    Saldo -= ValorTransf;
                    System.out.println("O novo saldo é de: " + Saldo);
                    break;
                case 3:
                    System.out.println("Insira o valor do depósito: ");
                    ValorTransf = operacaoValores.nextFloat();
                    Saldo += ValorTransf;
                    System.out.println("O novo saldo é de: " + Saldo);
                    break;
                case 4:
                    System.out.println("Encerrando menu");
            }
        }
        else {
            System.out.println("Encerrando Sistemas");
        };
    }
}
