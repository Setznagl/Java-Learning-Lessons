import java.util.Arrays;

public class Aula02_enums_e_strings {

    //Funciona como um tipo primitivo com regras estipuladas pelo contexto
    enum Dias {
        Segunda,
        Terça,
        Quarta,
        Quinta,
        Sexta,
        Sábado,
        Domingo
    }

    static Dias hoje = Dias.Segunda;

    public static void main(String[] args) {
        System.out.println("O valor de enum Dias é de: " + hoje);

        int[] ArranjoNumeros = new int[4];

        ArranjoNumeros[0] = 10;
        ArranjoNumeros[1] = 20;
        ArranjoNumeros[2] = 30;
        ArranjoNumeros[3] = 40;

        String ArranjoNumeros_legivel = Arrays.toString(ArranjoNumeros);

        System.out.println(ArranjoNumeros);
        System.out.println("Arranjo legível");
        System.out.println(ArranjoNumeros_legivel);
    }

}
