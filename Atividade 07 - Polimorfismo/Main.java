import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {

        ArrayList<Personagem> grupo = new ArrayList<>();
        grupo.add(new Guerreiro("He-man", 120, 5));
        grupo.add(new Mago("Merlin", 80, 8));
        grupo.add(new Arqueiro("Katniss Everdeen", 90, 6));
        grupo.add(new Guerreiro("Hércules", 120, 7));
        grupo.add(new Vilao("Voldemort", 100, 9));

        System.out.println("BATALHA DE PERSONAGENS");

        for (Personagem personagem : grupo) {
            personagem.atacar();
        }
    }
}
