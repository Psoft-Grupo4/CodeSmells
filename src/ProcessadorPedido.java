public class ProcessadorPedido {

    private double[] valores;
    private boolean comDesconto;

    public ProcessadorPedido(double[] valores, boolean comDesconto) {
        this.valores = valores;
        this.comDesconto = comDesconto;
    }

    public double[] getValores() {
        return valores;
    }

    public void setValores(double[] valores) {
        this.valores = valores;
    }

    public boolean isComDesconto() {
        return comDesconto;
    }

    public void setComDesconto(boolean comDesconto) {
        this.comDesconto = comDesconto;
    }

    // Este metodo processa o valor total do pedido recebido na lista
    public double proc() {
        double t = 0;
        // Percorre todos os elementos do vetor de valores
        for (int i = 0; i < valores.length; i++) {
            // Verifica se o indice atual e par para aplicar taxa diferente
            if (i % 2 == 0) {
                t += valores[i] * 1.1; // Adiciona 10 porcento de imposto
            } else {
                t += valores[i]; // Mantém o valor original se for impar
            }
        }
        // Se a flag de desconto for verdadeira, aplica um desconto de 5 por cento no total
        if (comDesconto == true) {
            t = t * 0.95;
        }
        // Retorna o resultado final do processamento calculado acima
        return t;
    }
}