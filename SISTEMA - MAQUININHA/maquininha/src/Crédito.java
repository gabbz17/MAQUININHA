public class Crédito {

    double cartao(int qtnd) {

        if (qtnd == 1) {
            System.out.println("Valor a pagar: " + Principal.preco);
            return Principal.preco;
        } else if (qtnd == 2) {
            System.out.println("Valor a pagar: " + (Principal.preco / 2));
            return Principal.preco / 2;
        } else if (qtnd == 3) {
            System.out.println("Valor a pagar: " + (Principal.preco / 3));
            return Principal.preco / 3;
        } else if (qtnd == 4) {
            System.out.println("Valor a pagar: " + (Principal.preco / 4));
            return Principal.preco / 4;
        } else if (qtnd == 5) {
            System.out.println("Valor a pagar: " + (Principal.preco / 5));
            return Principal.preco / 5;
        } else if (qtnd == 6) {
            System.out.println("Valor a pagar: " + (Principal.preco / 6));
            return Principal.preco / 6;
        } else if (qtnd == 7) {
            System.out.println("Valor a pagar: " + (Principal.preco / 7));
            return Principal.preco / 7;
        } else if (qtnd == 8) {
            System.out.println("Valor a pagar: " + (Principal.preco / 8));
            return Principal.preco / 8;
        }
        return 0;
    }
}
