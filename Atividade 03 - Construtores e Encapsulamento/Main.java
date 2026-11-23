public class Main {
    public static void main(String[] args) {

        Personagem personagem = new Personagem("Harry Potter", "Bruxo", 100);
        personagem.receberDano(30);
        personagem.recuperarVida(20);
        personagem.receberMoedas(50);
        personagem.gastarMoedas(40);
        personagem.subirNivel();

        System.out.println("Nome: " + personagem.getNome());
        System.out.println("Classe: " + personagem.getClasse());
        System.out.println("Vida: " + personagem.getVidaAtual() + "/" + personagem.getVidaMaxima());
        System.out.println("Nivel: " + personagem.getNivel());
        System.out.println("Moedas: " + personagem.getMoedas());
    }
}

