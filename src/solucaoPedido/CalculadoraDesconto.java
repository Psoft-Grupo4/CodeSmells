public class CalculadoraDesconto {

    public double calcular(Pedido pedido) {
        if (pedido.getFormaPagamento().equalsIgnoreCase("PIX")) {
            return pedido.getValorItens() * 0.10;
        }
        return 0.0;
    }
}