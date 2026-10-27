public class Usuario {

    private String nome;
    private String email;
    private String senha;
    private String telefone;

    public Usuario(String nome, String email, String senha, String telefone) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.telefone = telefone;
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    // Motivo de alteração 1: Regras de segurança e validação
    public boolean validarSenhaForte() {
        return senha != null && senha.length() >= 8 && senha.matches(".*[A-Z].*");
    }

    // Motivo de alteração 2: Comunicação / Templates de E-mail
    public String montarEmailBoasVindas() {
        return "Olá " + nome + ", bem-vindo ao sistema! Seu e-mail cadastrado é " + email;
    }

    // Motivo de alteração 3: Comunicação / Envio de SMS
    public String montarSmsToken(String token) {
        return "Enviado para " + telefone + ": Seu código de acesso é " + token;
    }

    // Motivo de alteração 4 (Novo agravante): Regras de Negócio de Fidelidade / Faturamento
    public int calcularPontosFidelidade(int mesesAtivo) {
        // Se a regra de cálculo de pontos da empresa mudar, você precisará modificar a classe Usuario
        return mesesAtivo * 15;
    }
}