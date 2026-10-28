public class CalcularFrete {

    public double calcular(Pedido pedido) {
        if (pedido.getEstadoDestino().equalsIgnoreCase("SP")) {
            return 15.0;
        }
        return 35.0;
    }
}