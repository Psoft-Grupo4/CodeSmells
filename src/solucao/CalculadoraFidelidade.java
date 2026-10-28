package solucao;

public class CalculadoraFidelidade {

    private int pontosPorMes;

    public CalculadoraFidelidade(int pontosPorMes) {
        this.pontosPorMes = pontosPorMes;
    }

    public int getPontosPorMes() {
        return pontosPorMes;
    }

    public void setPontosPorMes(int pontosPorMes) {
        this.pontosPorMes = pontosPorMes;
    }
    
    public int calcular(int mesesAtivo) {
        return mesesAtivo * pontosPorMes;
    }
}