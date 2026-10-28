package solucao;

public class ServicoNotificacao {

    private String remetentePadrao;
    private String gatewaySms;

    public ServicoNotificacao(String remetentePadrao, String gatewaySms) {
        this.remetentePadrao = remetentePadrao;
        this.gatewaySms = gatewaySms;
    }

    public String getRemetentePadrao() {
        return remetentePadrao;
    }

    public void setRemetentePadrao(String remetentePadrao) {
        this.remetentePadrao = remetentePadrao;
    }

    public String getGatewaySms() {
        return gatewaySms;
    }

    public void setGatewaySms(String gatewaySms) {
        this.gatewaySms = gatewaySms;
    }

    public String montarEmailBoasVindas(Usuario usuario) {
        return "[" + remetentePadrao + "] Olá " + usuario.getNome() + ", bem-vindo! Seu e-mail é " 
        + usuario.getEmail();
    }

    public String montarSmsToken(Usuario usuario, String token) {
        return "[" + gatewaySms + "] Enviado para " + usuario.getTelefone() + ": Código " 
        + token;
    }
}
