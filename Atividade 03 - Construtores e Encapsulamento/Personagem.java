public class Personagem {

    private String nome;
    private String classe;
    private int vidaAtual;
    private int vidaMaxima;
    private int nivel;
    private int moedas;

    public Personagem(String nome, String classe, int vidaMaxima) {
        this.nome = nome;
        this.classe = classe;
        this.vidaMaxima = vidaMaxima;
        this.vidaAtual = vidaMaxima;
        this.nivel = 1;
        this.moedas = 100;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getClasse() {
        return classe;
    }
    public void setClasse(String classe) {
        this.classe = classe;
    }
    public int getVidaAtual() {
        return vidaAtual;
    }
    public int getVidaMaxima() {
        return vidaMaxima;
    }
    public int getNivel() {
        return nivel;
    }
    public int getMoedas() {
        return moedas;
    }
    public void receberDano(int dano) {
        if (dano >= 0) {
            vidaAtual -= dano;

            if (vidaAtual < 0) {
                vidaAtual = 0;
            }
        }
    }
    public void recuperarVida(int quantidade) {
        if (quantidade >= 0) {
            vidaAtual += quantidade;

            if (vidaAtual > vidaMaxima) {
                vidaAtual = vidaMaxima;
            }
        }
    }
    public void receberMoedas(int quantidade) {
        if (quantidade >= 0) {
            moedas += quantidade;
        }
    }
    public void gastarMoedas(int quantidade) {
        if (quantidade >= 0 && quantidade <= moedas) {
            moedas -= quantidade;
        }
    }
    public void subirNivel() {
        nivel++;
    }
}
