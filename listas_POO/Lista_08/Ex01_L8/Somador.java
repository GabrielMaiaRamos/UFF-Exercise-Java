public class Somador {
    private int somatorio;

    public Somador() { // construtor sem parametros, apenas iniciar um somatorio
        this.somatorio = 0;
    }

    public void adicionar(int numero) {
        this.somatorio += numero;
    }

    public int getSomatorio() {
        return somatorio;
    }
}
