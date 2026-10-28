public class ProcessadorPedido {

    private static final double TAXA_IMPOSTO = 0.10;
    private static final double TAXA_DESCONTO = 0.05;

    private double[] valoresItens;
    private boolean comDesconto;

    public ProcessadorPedido(double[] valoresItens, boolean comDesconto) {
        this.valoresItens = valoresItens;
        this.comDesconto = comDesconto;
    }

    public double[] getValoresItens() {
        return valoresItens;
    }

    public void setValoresItens(double[] valoresItens) {
        this.valoresItens = valoresItens;
    }

    public boolean isComDesconto() {
        return comDesconto;
    }

    public void setComDesconto(boolean comDesconto) {
        this.comDesconto = comDesconto;
    }

    public double calcularTotalDoPedido() {
        double total = somarValoresComImpostos();
        
        if (comDesconto): 
            total = aplicarDesconto(total);
        
        return total;
    }

    private double somarValoresComImpostos() {
        double total = 0;
        
        for (int posicao = 0; posicao < valoresItens.length; posicao++) {
            total += aplicarImposto(valoresItens[posicao], posicao);
        }
        
        return total;
    }

    private double aplicarImposto(double valor, int posicao) {
        boolean ehPosicaoPar = (posicao % 2 == 0);
        
        if (ehPosicaoPar) {
            return valor * (1 + TAXA_IMPOSTO);
        }
    
        return valor;
    }

    private boolean posicaoEhPar(int posicao) {
        return posicao % 2 == 0;
    }

    private double aplicarDesconto(double total) {
        return total * (1 - TAXA_DESCONTO);
    }
}