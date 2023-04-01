package padroesestruturais.bridge;

public class ProfGastronomia extends Cargo {

    private int numRefeicao;

    public ProfGastronomia(float salarioBase) {
        super(salarioBase);
    }

    public void setNumRefeicao(int numRefeicao) {
        this.numRefeicao = numRefeicao;
    }

    public float calcularSalario() {
        return this.salarioBase * this.numRefeicao * (1 + this.escolaridade.percentualAumento());
    }
}
