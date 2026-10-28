public class Pedido {
    private String cliente;
    private double valorItens;
    private String estadoDestino;
    private String formaPagamento;

    public Pedido(String cliente, double valorItens, String estadoDestino, String formaPagamento) {
        this.cliente = cliente;
        this.valorItens = valorItens;
        this.estadoDestino = estadoDestino;
        this.formaPagamento = formaPagamento;
    }

    public String getCliente() { 
        return cliente; 
    }

    public void setCliente(String cliente) { 
        this.cliente = cliente; 
    }

    public double getValorItens() { 
        return valorItens; 
    }

    public void setValorItens(double valorItens) { 
        this.valorItens = valorItens; 
    }

    public String getEstadoDestino() { 
        return estadoDestino; 
    }

    public void setEstadoDestino(String estadoDestino) { 
        this.estadoDestino = estadoDestino; 
    }

    public String getFormaPagamento() { 
        return formaPagamento; 
    }

    public void setFormaPagamento(String formaPagamento) { 
        this.formaPagamento = formaPagamento; 
    }
}