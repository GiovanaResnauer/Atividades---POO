import java.util.ArrayList;
public class Perfil {
    private String nome;
    private ArrayList<Conteudo> lista;

    public Perfil(String nome) {
        this.nome = nome;
        this.lista = new ArrayList<>();
    }
    public String getNome() {
        return nome;
    }
    public ArrayList<Conteudo> getLista() {
        return lista;
    }
    public void adicionarConteudo(Conteudo conteudo) {
        lista.add(conteudo);
        System.out.println("Conteúdo adicionado à lista!");
    }
    public void removerConteudo(int indice) {
        if (indice >= 0 && indice < lista.size()) {
            lista.remove(indice);
            System.out.println("Conteúdo removido!");
        } else {
            System.out.println("Opção inválida.");
        }
    }
    public void exibirLista() {
        if (lista.isEmpty()) {
            System.out.println("A lista está vazia.");
            return;
        }
        for (int i = 0; i < lista.size(); i++) {
            System.out.println("\n" + (i + 1) + " - ");
            lista.get(i).exibirInformacoes();
        }
    }
}

