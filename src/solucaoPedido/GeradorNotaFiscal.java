public class GeradorNotaFiscal {

    private final CalculadoraFrete calculadoraFrete;
    private final CalculadoraDesconto calculadoraDesconto;

    public GeradorNotaFiscal(CalculadoraFrete calculadoraFrete, CalculadoraDesconto calculadoraDesconto) {
        this.calculadoraFrete = calculadoraFrete;
        this.calculadoraDesconto = calculadoraDesconto;
    }

    public String gerar(Pedido pedido) {
        double frete = calculadoraFrete.calcular(pedido);
        double desconto = calculadoraDesconto.calcular(pedido);
        double total = pedido.getValorItens() + frete - desconto;

        return "NF-e | Cliente: " + pedido.getCliente() + " | Total com Frete: " + total;
    }
}