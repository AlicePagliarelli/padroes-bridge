package padroesestruturais.bridge;

public class Gestao extends Cargo {

    public Gestao(float salarioBase) {
        super(salarioBase);
    }

    public float calcularSalario() {
        return this.salarioBase * (1 + this.escolaridade.percentualAumento());
    }

}
