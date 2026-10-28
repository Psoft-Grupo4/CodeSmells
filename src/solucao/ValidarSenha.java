package solucao;

public class ValidarSenha {

    private int tamanhoMinimo;
    private boolean exigeMaiuscula;

    public ValidarSenha(int tamanhoMinimo, boolean exigeMaiuscula) {
        this.tamanhoMinimo = tamanhoMinimo;
        this.exigeMaiuscula = exigeMaiuscula;
    }

    public int getTamanhoMinimo() {
        return tamanhoMinimo;
    }

    public void setTamanhoMinimo(int tamanhoMinimo) {
        this.tamanhoMinimo = tamanhoMinimo;
    }

    public boolean isExigeMaiuscula() {
        return exigeMaiuscula;
    }

    public void setExigeMaiuscula(boolean exigeMaiuscula) {
        this.exigeMaiuscula = exigeMaiuscula;
    }

    public boolean validar(Usuario usuario) {
        String senha = usuario.getSenha();
        if (senha == null || senha.length() < tamanhoMinimo) {
            return false;
        }
        if (exigeMaiuscula) {
            return senha.matches(".*[A-Z].*");
        }
        return true;
    }
}