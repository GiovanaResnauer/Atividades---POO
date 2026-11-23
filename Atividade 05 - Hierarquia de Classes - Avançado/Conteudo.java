public class Conteudo {
    private String titulo;
    private int ano;
    private String classificacao;

    public Conteudo(String titulo, int ano, String classificacao) {
        this.titulo = titulo;
        this.ano = ano;
        this.classificacao = classificacao;
    }
    public String getTitulo() {
        return titulo;
    }
    public void exibirInformacoes() {
        System.out.println("Título: " + titulo);
        System.out.println("Ano: " + ano);
        System.out.println("Classificação: " + classificacao);
    }
}

