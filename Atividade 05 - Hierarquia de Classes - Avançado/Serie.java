public class Serie extends Conteudo {
    private int temporadas;
    public Serie(String titulo, int ano, String classificacao, int temporadas) {
        super(titulo, ano, classificacao);
        this.temporadas = temporadas;
    }
    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Temporadas: " + temporadas);
        System.out.println("Tipo: Série");
    }
}

