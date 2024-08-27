public abstract class Veiculo {
    private String marca;
    private String modelo;
    private int ano;
    private Proprietario proprietario;

    public Veiculo(String marca, String modelo, int ano, Proprietario proprietario) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.proprietario = proprietario;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public Proprietario getProprietario() {
        return proprietario;
    }

    public void setProprietario(Proprietario proprietario) {
        this.proprietario = proprietario;
    }

    public abstract void exibirDetalhes();
}
