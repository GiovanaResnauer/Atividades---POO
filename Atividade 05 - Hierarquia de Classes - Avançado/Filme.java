public class Filme extends Conteudo {
    private int duracao;

    public Filme(String titulo, int ano, String classificacao, int duracao) {
        super(titulo, ano, classificacao);
        this.duracao = duracao;
    }
    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Duração: " + duracao + " minutos");
        System.out.println("Tipo: Filme");
    }
}

