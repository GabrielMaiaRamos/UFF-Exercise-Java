public class Vendedor extends Funcionario {
    private float bonusPercentual;

    public Vendedor(String nome, float salarioBruto, float bonusPercentual) {
        super(nome, salarioBruto);
        this.bonusPercentual = bonusPercentual;
    }

    public float getBonus() { // retorna o bonus em si
        return getSalarioBruto() * (this.bonusPercentual / 100);
    }

    @Override
    public float salarioLiquido() {
        float totalBruto = getSalarioBruto() + getBonus();
        return totalBruto - calcularIR(totalBruto); // muda o bruto, adicionando o bonus
    }
}
