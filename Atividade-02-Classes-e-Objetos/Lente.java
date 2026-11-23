
public class Lente {

    String marca;
    int distanciaFocal;
    double abertura;

    public void ajustarFoco() {
        System.out.println("Foco ajustado!");
    }
    public void aproximarImagem() {
        System.out.println("Imagem aproximada!");
    }
    public void afastarImagem() {
        System.out.println("Imagem afastada!");
    }
    public void limparLente() {
        System.out.println("Lente limpa!");
    }
    public void exibirInformacoes() {
        System.out.println("Marca: " + marca);
        System.out.println("Distancia focal: " + distanciaFocal);
        System.out.println("Abertura: " + abertura);
    }
}

