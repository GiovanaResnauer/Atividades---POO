public class Camera {

    String marca;
    int resolucao;
    int nivelBateria;

    public void ligar() {
        System.out.println("Ligada!");
    }
    public void desligar() {
        System.out.println("Desligada!");
    }
    public void tirarFoto() {
        nivelBateria -= 5;
        System.out.println("Foto tirada!");
    }
    public void gravarVideo() {
        nivelBateria -= 10;
        System.out.println("Gravando!");
    }
    public void carregarBateria() {
        nivelBateria = 100;
        System.out.println("Bateria carregada!");
    }
}

