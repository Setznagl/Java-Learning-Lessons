package DIO_Exercises;

import java.util.Scanner;

/*
Programa de exerício para ler dois conjuntos de valores, o primeiro representando o nome de um aluno
e o segundo representando  a sua idade ( para encerrar aperte 0 no campo nome )
*/
public class DIO_A4_repeticao_e_arrays {

// Método escanear com escopo static para poder ser acesso pelos métodos

    static Scanner escanear = new Scanner(System.in);

    public static void main(String[] args) {

        /*  Bloco Principal de funções
        ////////////////////////////////
        ////////////////////////////////
        ////////////////////////////////
        ////////////////////////////////
        ////////////////////////////////
        //////////////////////////////// */
        scanNomeIdade(escanear.next(), escanear.nextInt());
        notaValida(escanear.nextInt());


    }

    public static void scanNomeIdade(String arg1, int arg2) {
        System.out.println("Recebido como parametro " + arg1 + "  " + arg2);

        String nome = arg1;
        int idade = arg2;
        System.out.println("Os dados inseridos foram: " + nome + "  e  " + idade);

        while (!nome.equals("0")) {
            System.out.println("Programa em andamento, insira um nome e idade :");
            nome = escanear.next();
            idade = escanear.nextInt();
            if (nome.equals("0")) break;
            System.out.println("Os dados inseridos foram: " + nome + "  e  " + idade);
        }
        System.out.println("Sistema encerrado, nome digitado como 0 ");
    };

    public static void notaValida(int nota1) {
            System.out.println("Validador de notas");
        while (nota1 < 0|| nota1 > 10) {
            System.out.println("A nota digitada foi " + nota1);
            if(nota1 < 0 || nota1 > 10){
                System.out.println("Inválido, nota fora do escopo");
                System.out.println("Insira uma nota para validação");
                nota1 = escanear.nextInt();}
            else { break;};
        }
        System.out.println("A nota digitada é válida e foi : " + nota1);
    };







}

