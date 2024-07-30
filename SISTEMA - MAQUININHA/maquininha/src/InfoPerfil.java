public class InfoPerfil {
    private String nome, cpfCNPJ, numeroCelular, email, dataNasc;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNumeroCelular(String numeroCelular) {
        this.numeroCelular = numeroCelular;
    }

    public String getNumeroCelular() {
        return numeroCelular;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setDataNasc(String dataNasc) {
        this.dataNasc = dataNasc;
    }

    public String getDataNasc() {
        return dataNasc;
    }

    public void setCpfCNPJ(String cpfCNPJ) {
        this.cpfCNPJ = cpfCNPJ;
    }

    public String getCpfCNPJ() {
        return cpfCNPJ;
    }

    public static void alterarInfo() {
        InfoPerfil info = new InfoPerfil();
        System.out.println("--------------------");
        System.out.println("Informe seu Nome: ");
        Principal.entrada.nextLine();
        info.setNome(Principal.entrada.nextLine());

        System.out.println("Informe seu CPF ou CNPJ: ");
        info.setCpfCNPJ(Principal.entrada.nextLine());

        System.out.println("Informe seu Número de Celular: ");
        info.setNumeroCelular(Principal.entrada.nextLine());

        System.out.println("Informe seu Email: ");
        info.setEmail(Principal.entrada.nextLine());

        System.out.println("Informe sua Data de Nascimento: ");
        info.setDataNasc(Principal.entrada.nextLine());
    }

    public static void visualizarInfo() {
        InfoPerfil info = new InfoPerfil();
        System.out.println("--------------------");
        System.out.println("Nome: " + info.getNome());
        System.out.println("CPF ou CNPJ: " + info.getCpfCNPJ());
        System.out.println("Número de celular: " + info.getNumeroCelular());
        System.out.println("Email: " + info.getEmail());
        System.out.println("Data de nascimento: " + info.getDataNasc());
    }
}
