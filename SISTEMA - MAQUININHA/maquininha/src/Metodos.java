public class Metodos {
    public static boolean validacao = true;

    protected static void valorCompra() {
        System.out.printf("Valor total da compra: %f \n", Principal.preco);
    }

    protected static void validacao() {
        if (validacao) {
            System.out.println("--------------------");
            System.out.println("PAGAMENTO CONFIRMADO");
            System.out.println("OBRIGADO, VOLTE SEMPRE!");
        } else {
            System.out.println("--------------------");
            System.out.println("PAGAMENTO NÃO CONFIRMADO");
        }
    }

}
