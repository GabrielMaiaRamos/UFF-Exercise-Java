public class Funcionario {
    private String nome;
    private float salarioBruto;

    public Funcionario(String nome, float salarioBruto) {
        this.nome = nome;
        this.salarioBruto = salarioBruto;
    }

    protected float calcularIR(float base) {
        if (base <= 900) {
            return 0;
        } else if (base <= 1500) {
            return base * 0.15f;
        } else {
            return base * 0.20f;
        }
    }

    public float salarioLiquido() {
        return salarioBruto - calcularIR(salarioBruto);
    }

    public String getNome() {
        return nome;
    }

    public float getSalarioBruto() {
        return salarioBruto;
    }
}
