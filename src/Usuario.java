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

    public boolean validarSenhaForte() {
        return senha != null && senha.length() >= 8 && senha.matches(".*[A-Z].*");
    }

    public String montarEmailBoasVindas() {
        return "Olá " + nome + ", bem-vindo ao sistema! Seu e-mail cadastrado é " + email;
    }

    public String montarSmsToken(String token) {
        return "Enviado para " + telefone + ": Seu código de acesso é " + token;
    }

    public int calcularPontosFidelidade(int mesesAtivo) {
        return mesesAtivo * 15;
    }
}