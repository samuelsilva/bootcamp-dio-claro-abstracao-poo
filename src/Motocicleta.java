public class Motocicleta extends Veiculo {
    private int cilindradas;

    public Motocicleta(String marca, String modelo, int ano, Proprietario proprietario, int cilindradas) {
        super(marca, modelo, ano, proprietario);
        this.cilindradas = cilindradas;
    }

    public int getCilindradas() {
        return cilindradas;
    }

    public void setCilindradas(int cilindradas) {
        this.cilindradas = cilindradas;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Motocicleta: " + getMarca() + " " + getModelo() + ", Ano: " + getAno() + ", Cilindradas: " + cilindradas);
    }
}
