public class Carro extends Veiculo {
    private int numeroPortas;

    public Carro(String marca, String modelo, int ano, Proprietario proprietario, int numeroPortas) {
        super(marca, modelo, ano, proprietario);
        this.numeroPortas = numeroPortas;
    }

    public int getNumeroPortas() {
        return numeroPortas;
    }

    public void setNumeroPortas(int numeroPortas) {
        this.numeroPortas = numeroPortas;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Carro: " + getMarca() + " " + getModelo() + ", Ano: " + getAno() + ", Portas: " + numeroPortas);
    }
}
