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
        scanNomeIdade(escanear.next(), escanear.nextInt());
        notaValida(escanear.nextInt());
         */
        maiorE_Media(escanear.nextInt(), escanear.nextInt(), escanear.nextInt(), escanear.nextInt(), escanear.nextInt());



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

    public static int notaValida(int nota1) {
        while (nota1 < 0|| nota1 > 10) {
            System.out.println("A nota digitada foi " + nota1);
            if(nota1 < 0 || nota1 > 10){
                System.out.println("Inválido, nota fora do escopo");
                System.out.println("Insira uma nota para validação");
                nota1 = escanear.nextInt();}
            else { break;};
        }
        System.out.println("A nota digitada é válida e foi : " + nota1);
        return nota1;
    };

    public static void maiorE_Media(int nota1, int nota2, int nota3, int nota4, int nota5){
        System.out.println("As notas selecionadas foram " + nota1 +" , "+ nota2 +" , "+nota3+" , "+nota4+" , "+nota5);
        int[] notasValidadas = new int[5];
            notasValidadas[0] = notaValida(nota1);
            notasValidadas[1] = notaValida(nota2);
            notasValidadas[2] = notaValida(nota3);
            notasValidadas[3] = notaValida(nota4);
            notasValidadas[4] = notaValida(nota5);
            // i é a variável iteravel similar as usadas em "for"
            int i = 0;
            // comparador iniciará com o valor da primeira nota digitada para comparações
            int comparador = notasValidadas[0];
                do {
                    if (i >= notasValidadas.length) break;
                    else {
                        if (notasValidadas[i] > comparador){ comparador = notasValidadas[i];}
                        i++;
                        System.out.println("O maior número atualmente é : " + comparador);
                    }
                }while (i < notasValidadas.length);
            float mediaNotas = (float) (notasValidadas[0] + (float) notasValidadas[1] + (float) notasValidadas[2] +
                    (float) notasValidadas[3] + (float) notasValidadas[4]) /notasValidadas.length;
            System.out.println("A média das notas é de : " + mediaNotas);
    }




}

