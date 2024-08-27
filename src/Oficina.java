import java.util.ArrayList;
import java.util.List;

public class Oficina {
    private String nome;
    private List<ServicoManutencao> servicos = new ArrayList<>();

    public Oficina(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void adicionarServico(ServicoManutencao servico) {
        servicos.add(servico);
    }

    public void listarServicos() {
        for (ServicoManutencao servico : servicos) {
            System.out.println(servico.getDescricao() + " - R$" + servico.getValor());
        }
    }
}
