import java.util.Scanner;

public class Principal extends Metodos {
    public static Scanner entrada = new Scanner(System.in);
    public static double preco;
    public static boolean validacao = false;

    public static void main(String[] args) {
        telaPrincipal();
    }

    public static void telaPrincipal() {
        System.out.println("----------BEM VINDO----------");
        System.out.println("Selecione qual ação deseja realizar: \n1.Pagamentos \n2.Configurações \n3.Sair");
        int n = entrada.nextInt();
        switch (n) {
            case 1:
                telaPagamentos();
                break;
            case 2:
                configuraçõesPerfil();
                break;
            case 3:
                break;

            default:
                System.out.println("Selecione uma das opções acima!");
                telaPrincipal();
                break;
        }
    }

    // CONFIGURAÇÕES

    private static void configuraçõesPerfil() {
        System.out.println("----------Configurações----------");
        System.out.println("Selecione o que deseja: \n1.Configurar perfil \n2.Outras configurações");
        int n = entrada.nextInt();
        switch (n) {
            case 1:
                confPerfil();
                break;
            case 2:
                configuraçõesPerfil();
                break;

            default:
                System.out.println("Selecione uma das opções acima!");
                configuraçõesPerfil();
                break;
        }
    }

    private static void confPerfil() {
        System.out.println("----------Configurações de perfil----------");
        System.out.println("Selecione a ação desejada: \n1.Visualizar perfil \n2.Alterar informações");
        int n = entrada.nextInt();
        switch (n) {
            case 1:
                InfoPerfil.visualizarInfo();
                break;

            case 2:
                InfoPerfil.alterarInfo();
                break;

            default:
                break;
        }
    }

    private static void telaPagamentos() {
        System.out.println("----------Área de pagamentos----------");
        System.out.println(
                "Selecione a forma de pagamento: \n1.PIX \n2.Cartão de crédito \n3.Cartão de débito \n4.Retornar a tela inicial");
        int n = entrada.nextInt();
        switch (n) {
            case 1:
                telaPIX();
                break;

            case 2:
                telaCredito();
                break;

            case 3:
                telaDebito();
                break;
            case 4:
                telaPrincipal();
                break;
        }
    }

    // FORMAS DE PAGAMENTOS

    private static void telaDebito() {
        System.out.println("----------Cartão de débito----------");
        System.out.println("Informe o valor da compra:");
        preco = entrada.nextDouble();
        valorCompra();
        System.out.println("Espera do pagamento!");
        validacao();
    }

    private static void telaCredito() {
        Crédito credito = new Crédito();
        System.out.println("----------Cartão de crédito----------");
        System.out.println("Informe o valor da compra:");
        preco = entrada.nextDouble();
        valorCompra();
        System.out.println("Informe em quantas vezes você irá dividir:");
        credito.cartao(entrada.nextInt());
        validacao();
    }

    private static void telaPIX() {
        System.out.println("----------PIX----------");
        System.out.println("Informe o valor da compra:");
        preco = entrada.nextDouble();
        valorCompra();
        System.out.println("Exibição do pix");
        validacao();
    }
}
