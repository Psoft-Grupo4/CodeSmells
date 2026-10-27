public class ValidadorCheckout {

    public boolean validarCep(String cep) {
        if (cep == null) {
            return false;
        }
        String apenasDigitos = cep.replaceAll("\\D", "");
        if (apenasDigitos.length() != 8) {
            return false;
        }
        return apenasDigitos.matches("\\d{8}");
    }

    public boolean validarCpf(String cpf) {
        if (cpf == null) {
            return false;
        }
        String apenasDigitos = cpf.replaceAll("\\D", "");
        if (apenasDigitos.length() != 11) {
            return false;
        }
        return apenasDigitos.matches("\\d{11}");
    }

    public boolean validarCartao(String numeroCartao) {
        if (numeroCartao == null) {
            return false;
        }
        String apenasDigitos = numeroCartao.replaceAll("\\D", "");
        if (apenasDigitos.length() != 16) {
            return false;
        }
        return apenasDigitos.matches("\\d{16}");
    }

    public boolean validarTelefone(String telefone) {
        if (telefone == null) {
            return false;
        }
        String apenasDigitos = telefone.replaceAll("\\D", "");
        if (apenasDigitos.length() != 11 && apenasDigitos.length() != 10) {
            return false;
        }
        return apenasDigitos.matches("\\d{10,11}");
    }
}
