public class ValidadorCheckout {

    public boolean validarCep(String cep) {
        return possuiTamanhoValido(cep, 8);
    }

    public boolean validarCpf(String cpf) {
        return possuiTamanhoValido(cpf, 11);
    }

    public boolean validarCartao(String numeroCartao) {
        return possuiTamanhoValido(numeroCartao, 16);
    }

    public boolean validarTelefone(String telefone) {
        return possuiTamanhoValido(telefone, 10, 11);
    }

    private boolean possuiTamanhoValido(String valor, int... tamanhosValidos) {
        if (valor == null) {
            return false;
        }
        
        String apenasDigitos = valor.replaceAll("\\D", "");
        
        for (int tamanho : tamanhosValidos) {
            if (apenasDigitos.length() == tamanho) {
                return true;
            }
        }
        
        return false;
    }
}