public class Vilao extends Personagem {
    public Vilao(String nome, int vida, int nivel) {
        super(nome, vida, nivel);
    }
    @Override
    public void atacar() {
        System.out.println(getNome() + " realiza um ataque sombrio!");
    }
}

