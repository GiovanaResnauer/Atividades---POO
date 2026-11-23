
public class Tripe {

    String marca;
    double altura;
    boolean aberto;

    public void abrir() {
        aberto = true;
        System.out.println("Aberto!");
    }
    public void fechar() {
        aberto = false;
        System.out.println("Fechado!");
    }
    public void ajustarAltura(double novaAltura) {
        altura = novaAltura;
        System.out.println("Altura ajustada!");
    }
    public void travarPernas() {
        System.out.println("Travado!");
    }
    public void exibirAltura() {
        System.out.println("Altura: " + altura);
    }
}
