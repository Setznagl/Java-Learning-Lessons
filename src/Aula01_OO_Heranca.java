public class Aula01_OO_Heranca {

    // Movendo a classe Pessoa para fora do método main
    static class Pessoa {
        public String nome;
        public String email;
        public Long cpf;

        static class DadosBancarios extends Pessoa {
            public String bancoNome;
            public Double saldo;

            public String exibirDadosTotais(String parametro1, String parametro2) {
                return "=== Dados Totais da Pessoa ===" + "\n" +
                        "Nome: " + this.nome + "\n" +
                        "Email: " + this.email + "\n" +
                        "CPF: " + this.cpf + "\n" +
                        "parameter1" + "  " + parametro1 + "\n" +
                        "parameter2" + "  " + parametro2 + "\n" +
                        "Banco: " + this.bancoNome + "\n" +
                        "Saldo: " + this.saldo;
            }
        }


        public static void main(String[] args) {
            // Objeto Andre
            DadosBancarios andre = new DadosBancarios();
            andre.nome = "Andre";
            andre.email = "andre@gmail.com";
            andre.cpf = 1324894564415L;
            andre.bancoNome = "Bradesco";
            andre.saldo = 1324.79;
            /* Imprimindo os dados */
            System.out.println(andre.exibirDadosTotais("21", String.valueOf(22)));
            System.out.println("teste");
        }
    }
}