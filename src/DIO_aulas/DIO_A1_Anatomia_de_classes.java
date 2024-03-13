package DIO_aulas;

public class DIO_A1_Anatomia_de_classes {
    public static void main(String[] args) {
        System.out.println("Testing simple output");

        String Variavel = "That's a Variable";
        final String Constante = "That's a constant";

        System.out.println(Variavel);
        System.out.println(Constante);

        //Comparação de textos através do arg1.equals(arg2)
        System.out.println(Variavel.equals(Constante));

        String Concatenacao = Variavel.concat(" and ") + Constante;
        System.out.println(Concatenacao);

        int NumeroInteiro = 21;
        float NumeroDecimal = 22.678F;

        System.out.println("O Número inteiro definido é de : " + NumeroInteiro + " e o número decimal definido é de " + NumeroDecimal);

    }
}
