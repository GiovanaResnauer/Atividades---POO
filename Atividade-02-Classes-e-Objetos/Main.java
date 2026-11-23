public class Main {
    public static void main(String[] args) {

        Camera camera = new Camera();
        camera.marca = "Canon";
        camera.resolucao = 24;
        camera.nivelBateria = 80;

        camera.ligar();
        camera.desligar();
        camera.tirarFoto();
        camera.gravarVideo();
        camera.carregarBateria();

        Lente lente = new Lente();
        lente.marca = "Sony";
        lente.distanciaFocal = 50;
        lente.abertura = 1.8;

        lente.ajustarFoco();
        lente.aproximarImagem();
        lente.afastarImagem();
        lente.limparLente();
        lente.exibirInformacoes();

        Tripe tripe = new Tripe();
        tripe.marca = "Manfrotto";
        tripe.altura = 1.5;
        tripe.aberto = false;

        tripe.abrir();
        tripe.fechar();
        tripe.ajustarAltura(1.8);
        tripe.travarPernas();
        tripe.exibirAltura();
    }
}
