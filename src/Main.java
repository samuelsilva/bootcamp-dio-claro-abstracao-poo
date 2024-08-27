public class Main {
    public static void main(String[] args) {
        Proprietario proprietario1 = new Proprietario("Jo�o Silva", "Rua A, 123");
        Veiculo carro = new Carro("Toyota", "Corolla", 2021, proprietario1, 4);
        Veiculo moto = new Motocicleta("Yamaha", "MT-07", 2020, proprietario1, 689);

        carro.exibirDetalhes();
        moto.exibirDetalhes();

        Oficina oficina = new Oficina("Oficina do Jo�o");
        ServicoManutencao trocaOleo = new ServicoManutencao("Troca de �leo", 150.0);
        ServicoManutencao alinhamento = new ServicoManutencao("Alinhamento", 100.0);

        oficina.adicionarServico(trocaOleo);
        oficina.adicionarServico(alinhamento);

        oficina.listarServicos();
    }
}
