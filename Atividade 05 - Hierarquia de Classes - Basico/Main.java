public class Main {
    public static void main(String[] args) {
        Guerreiro guerreiro = new Guerreiro("Ragnar", 120, 20, 15);
        Mago mago = new Mago("Merlin", 80, 100, 30);
        Arqueiro arqueiro = new Arqueiro("Orion", 90, 20, 25);

        System.out.println("GUERREIRO");
        System.out.println("Nome: " + guerreiro.getNome());
        System.out.println("Vida: " + guerreiro.getVidaAtual() + "/" + guerreiro.getVidaMaxima());
        System.out.println("Nível: " + guerreiro.getNivel());
        System.out.println("Moedas: " + guerreiro.getMoedas());
        System.out.println("Força: " + guerreiro.getForca());
        System.out.println("Armadura: " + guerreiro.getArmadura());

        guerreiro.golpear();

        System.out.println("MAGO");
        System.out.println("Nome: " + mago.getNome());
        System.out.println("Vida: " + mago.getVidaAtual() + "/" + mago.getVidaMaxima());
        System.out.println("Nível: " + mago.getNivel());
        System.out.println("Moedas: " + mago.getMoedas());
        System.out.println("Mana: " + mago.getMana());
        System.out.println("Poder mágico: " + mago.getPoderMagico());

        while (mago.getMana() >= 10) {
            mago.lancarMagia();
        }

        mago.lancarMagia();

        System.out.println("ARQUEIRO");
        System.out.println("Nome: " + arqueiro.getNome());
        System.out.println("Vida: " + arqueiro.getVidaAtual() + "/" + arqueiro.getVidaMaxima());
        System.out.println("Nível: " + arqueiro.getNivel());
        System.out.println("Moedas: " + arqueiro.getMoedas());
        System.out.println("Flechas: " + arqueiro.getQuantidadeFlechas());
        System.out.println("Precisão: " + arqueiro.getPrecisao());

        while (arqueiro.getQuantidadeFlechas() > 0) {
            arqueiro.atirar();
        }
        arqueiro.atirar();

        guerreiro.receberDano(30);
        guerreiro.recuperarVida(10);
        guerreiro.receberMoedas(50);

        mago.receberDano(20);
        mago.recuperarVida(10);
        mago.receberMoedas(30);

        arqueiro.receberDano(15);
        arqueiro.recuperarVida(5);
        arqueiro.receberMoedas(40);

        System.out.println("Guerreiro: " + guerreiro.getNome());
        System.out.println("Vida: " + guerreiro.getVidaAtual() + "/" + guerreiro.getVidaMaxima());
        System.out.println("Moedas: " + guerreiro.getMoedas());

        System.out.println("Mago: " + mago.getNome());
        System.out.println("Vida: " + mago.getVidaAtual() + "/" + mago.getVidaMaxima());
        System.out.println("Moedas: " + mago.getMoedas());

        System.out.println("Arqueiro: " + arqueiro.getNome());
        System.out.println("Vida: " + arqueiro.getVidaAtual() + "/" + arqueiro.getVidaMaxima());
        System.out.println("Moedas: " + arqueiro.getMoedas());
    }
}
