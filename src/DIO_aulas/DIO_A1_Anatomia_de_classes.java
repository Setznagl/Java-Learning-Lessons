public class DIO_A1_Anatomia_de_classes {
    public static void main(String[] args) {
        System.out.println("Testing simple output");

        String Variavel = "That's a Variable";
        final String Constante = "That's a constant";

        System.out.println(Variavel);
        System.out.println(Constante);

        String Concatenacao = Variavel.concat(" ") + Constante;
        System.out.println(Concatenacao);

    }
}